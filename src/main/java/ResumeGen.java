import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdfwriter.compress.CompressParameters;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

class ResumeGen implements Closeable {
    File file;
    PDDocument doc = new PDDocument();
    PDPage page = new PDPage();
    PDPageContentStream cs;
    ResumeGen(File file) throws IOException {
        this.file = file;
        doc.addPage(page);
        cs = new PDPageContentStream(doc, page);
    }

    PDFont header = PDType0Font.load(doc, new File("fonts/Source_Serif_4/static/SourceSerif4-Bold.ttf"));
    PDFont normal = PDType0Font.load(doc, new File("fonts/Lato/Lato-Regular.ttf"));
    PDFont bold = PDType0Font.load(doc, new File("fonts/Lato/Lato-Bold.ttf"));
    PDFont italic = PDType0Font.load(doc, new File("fonts/Lato/Lato-Italic.ttf"));

    // PDF Built-In Fonts - Lower File Size
    // PDFont header = new PDType1Font(FontName.TIMES_BOLD);
    // PDFont normal = new PDType1Font(FontName.HELVETICA);
    // PDFont bold = new PDType1Font(FontName.HELVETICA_BOLD);
    // PDFont italic = new PDType1Font(FontName.HELVETICA_OBLIQUE);

    float ppi = 72;

    float marginx = ppi * .5f;
    float marginy = ppi * .5f;

    float lineSpacing = .5f;
    float y = page.getCropBox().getUpperRightY();

    void write(Resume resume) throws IOException {
        y -= marginy;
        for (Section s : resume.sections()) {
            switch (s) {
                case Header h -> {
                    {
                        float headerFontSize = 18f;
                        PDFont font = header;

                        float x = page.getCropBox().getWidth() *.5f - font.getStringWidth(h.name()) * headerFontSize / 2000f;
                        cs.beginText();
                        cs.setFont(font, headerFontSize);
                        float fh = fontHeight(font, headerFontSize);
                        y -= fh * (1f + (.5f * lineSpacing));
                        cs.newLineAtOffset(x, y);
                        cs.showText(h.name());
                        cs.newLine();
                        y -= fh * .5f * lineSpacing;
                        cs.endText();
                    }
                    y -= 2f;
                    {
                        float contactFontSize = 12f;
                        PDFont font = normal;
                        float sepwidth = .5f;

                        float totalsepwidth = font.getStringWidth(" | ") * contactFontSize / 1000f;
                        float spaceWidth = font.getStringWidth(" ") * contactFontSize / 1000f;
                        float totalWidth = totalsepwidth * (h.contact().length - 1);
                        float fh = fontHeight(font, contactFontSize);
                        for (ContactInfo ci : h.contact()) {
                            totalWidth += switch (ci) {
                                case PlainContactInfo pci -> font.getStringWidth(pci.info()) * contactFontSize / 1000f;
                                case Link l -> (l.icon() == null ? 0 : (fh / l.icon().height) * l.icon().width + spaceWidth) + font.getStringWidth(l.text()) * contactFontSize / 1000f;
                            };
                        }
                        float x = page.getCropBox().getWidth() *.5f - totalWidth * .5f;
                        y -= fh * (1f + (.5f * lineSpacing));
                        boolean first = true;
                        for (ContactInfo ci : h.contact()) {
                            if (!first) {
                                x += totalsepwidth * .5f;
                                cs.addRect(x - sepwidth * .5f, y - fh * .5f * lineSpacing, sepwidth, fh * (1f + lineSpacing));
                                cs.fill();
                                x += totalsepwidth * .5f;
                            }
                            switch (ci) {
                                case PlainContactInfo pci -> {
                                    cs.beginText();
                                    cs.setFont(font, contactFontSize);
                                    cs.newLineAtOffset(x, y);
                                    cs.showText(pci.info());
                                    cs.newLine();
                                    cs.endText();
                                    x += font.getStringWidth(pci.info()) * contactFontSize / 1000f;
                                }
                                case Link l -> {
                                    float startx = x;
                                    if (l.icon() != null) {
                                        float scale = (fh / l.icon().height);
                                        float width = scale * l.icon().width;
                                        l.icon().draw(x, y, scale, cs);
                                        x += width;
                                        x += spaceWidth;
                                    }
                                    cs.beginText();
                                    cs.setFont(font, contactFontSize);
                                    cs.newLineAtOffset(x, y);
                                    cs.showText(l.text());
                                    cs.newLine();
                                    cs.endText();
                                    x += font.getStringWidth(l.text()) * contactFontSize / 1000f;
                                    var link = new PDAnnotationLink();
                                    var action = new PDActionURI();
                                    action.setURI(l.link()); 
                                    link.setAction(action);
                                    link.setRectangle(new PDRectangle(startx, y - fh*.5f*lineSpacing, x - startx, fh + fh*lineSpacing));
                                    page.getAnnotations().add(link);
                                }
                            }
                            first = false;
                        }
                        y -= fh * .5f * lineSpacing;
                    }
                }
                case LabeledSection ls -> {
                    y -= 6f;
                    {
                        float headerFontSize = 14f;
                        PDFont font = header;
                        float lineSize = 1f;

                        float x = marginx;
                        cs.beginText();
                        cs.setFont(font, headerFontSize);
                        float fh = fontHeight(font, headerFontSize);
                        y -= fh * (1f + (.5f * lineSpacing));
                        cs.newLineAtOffset(x, y);
                        cs.showText(ls.name());
                        cs.newLine();
                        cs.endText();
                        x += font.getStringWidth(ls.name()) * headerFontSize / 1000f;
                        x += 2f;
                        cs.addRect(x, y + .5f * fh - .5f * lineSize, page.getCropBox().getWidth() - marginx - x, lineSize);
                        cs.fill();
                        y -= fh * .5f * lineSpacing;
                    }
                    {
                        float textSize = 12f;
                        float fh = fontHeight(normal, textSize);
                        float bulletIndent = 27f;

                        for (Item i : ls.items()) {
                            y -= 4f;
                            boolean printedLeft = false;
                            boolean printedRight = false;
                            for (ItemElement ie : i.elements()) {
                                switch (ie) {
                                    case BasicText bt -> {
                                        if ((printedLeft && bt.align() == Alignment.LEFT) || (printedRight && bt.align() == Alignment.RIGHT)) {
                                            y -= fh * .5f * lineSpacing;
                                            printedLeft = false;
                                            printedRight = false;
                                        }
                                        if (!(printedLeft || printedRight)) {
                                            y -= fh * (1f + (.5f * lineSpacing));
                                        }
                                        PDFont font = switch (bt.format()) {
                                            case NORMAL -> normal;
                                            case BOLD -> bold;
                                            case ITALIC -> italic;
                                        };
                                        float x = switch (bt.align()) {
                                            case LEFT -> marginx;
                                            case RIGHT -> page.getCropBox().getWidth() - marginx - font.getStringWidth(bt.text()) * textSize / 1000f;
                                        };
                                        cs.beginText();
                                        cs.setFont(font, textSize);
                                        cs.newLineAtOffset(x, y);
                                        cs.showText(bt.text());
                                        cs.newLine();
                                        cs.endText();
                                        switch (bt.align()) {
                                            case LEFT -> printedLeft = true;
                                            case RIGHT -> printedRight = true;
                                        }
                                    }
                                    case JakeStyleProjectText jt -> {
                                        if (printedLeft) {
                                            y -= fh * .5f * lineSpacing;
                                            printedLeft = false;
                                            printedRight = false;
                                        }
                                        if (!(printedLeft || printedRight)) {
                                            y -= fh * (1f + (.5f * lineSpacing));
                                        }
                                        float x = marginx;
                                        cs.beginText();
                                        cs.setFont(bold, textSize);
                                        cs.newLineAtOffset(x, y);
                                        cs.showText(jt.text());
                                        cs.newLine();
                                        cs.endText();
                                        x += bold.getStringWidth(jt.text()) * textSize / 1000f;
                                        cs.beginText();
                                        cs.setFont(normal, textSize);
                                        cs.newLineAtOffset(x, y);
                                        cs.showText(" | " + jt.tools());
                                        cs.newLine();
                                        cs.endText();
                                        printedLeft = true;
                                    }
                                    case BulletPoint bp -> {
                                        if (printedLeft || printedRight) {
                                            y -= fh * .5f * lineSpacing;
                                            printedLeft = false;
                                            printedRight = false;
                                        }

                                        boolean first = true;
                                        for (String line : lineWrap(bp.text(), normal, (page.getCropBox().getWidth() - marginx * 2 - bulletIndent) / textSize)) {
                                            y -= fh * (1f + (.5f * lineSpacing));
                                            if (first) drawCircle(marginx + bulletIndent * .5f, y + fh * .5f, 2f);
                                            cs.beginText();
                                            cs.setFont(normal, textSize);
                                            cs.newLineAtOffset(marginx + bulletIndent, y);
                                            cs.showText(line);
                                            cs.newLine();
                                            cs.endText();
                                            y -= fh * .5f * lineSpacing;
                                            first = false;
                                        }

                                    }
                                    case Padding p -> {
                                        if (printedLeft || printedRight) {
                                            y -= fh * .5f * lineSpacing;
                                            printedLeft = false;
                                            printedRight = false;
                                        }
                                        y -= p.size();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    List<String> lineWrap(String s, PDFont font, float length) throws IOException {
        var r = new ArrayList<String>();
        double l = length * 1000.0;
        double scost = font.getStringWidth(" ");
        var words = s.split(" ");
        int lineStart = 0;
        while (lineStart != words.length) {
            var sb = new StringBuilder();
            sb.append(words[lineStart]);
            int lineEnd = lineStart + 1;
            double cost = font.getStringWidth(words[lineStart]);
            while (cost <= l && lineEnd < words.length) {
                double dcost = scost + font.getStringWidth(words[lineEnd]);
                if (cost + dcost <= l) {
                    sb.append(' ');
                    sb.append(words[lineEnd]);
                    cost += dcost;
                    lineEnd += 1;
                } else {
                    break;
                }
            }
            r.add(sb.toString());
            lineStart = lineEnd;
        }
        return r;
    }

    // https://stackoverflow.com/questions/42811353/adding-of-filled-circles-to-pdf-page-using-apache-pdfbox
    private void drawCircle(float cx, float cy, float r) throws IOException {
        final float k = 0.552284749831f;
        cs.moveTo(cx - r, cy);
        cs.curveTo(cx - r, cy + k * r, cx - k * r, cy + r, cx, cy + r);
        cs.curveTo(cx + k * r, cy + r, cx + r, cy + k * r, cx + r, cy);
        cs.curveTo(cx + r, cy - k * r, cx + k * r, cy - r, cx, cy - r);
        cs.curveTo(cx - k * r, cy - r, cx - r, cy - k * r, cx - r, cy);
        cs.fill();
    }

    float fontHeight(PDFont font, float fontSize) {
        return font.getFontDescriptor().getCapHeight() / 1000 * fontSize;
    }

    @Override
    public void close() throws IOException {
        cs.close();
        doc.save(file, CompressParameters.NO_COMPRESSION);
        doc.close();
    }
}