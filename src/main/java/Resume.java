import java.io.File;
import java.io.IOException;

record Resume(Section[] sections) {
    void write(File f) throws IOException {
        try (ResumeGen gen = new ResumeGen(f)) {
            gen.write(this);
        }
    }
}
sealed interface Section { }
record Header(String name, ContactInfo[] contact) implements Section { }
sealed interface ContactInfo { }
record Link(/* Nullable */ Icon icon, String text, String link) implements ContactInfo {
    static Link email(String email) {
        return new Link(Icon.EMAIL, email, "mailto:" + email);
    }
    static Link https(/* Nullable */ Icon icon, String link) {
        return new Link(icon, link, "https://" + link);
    }
}
record PlainContactInfo(String info) implements ContactInfo { }

record LabeledSection(String name, Item[] items) implements Section { }
record Item(ItemElement[] elements) { }
sealed interface ItemElement { }
enum Alignment {
    LEFT,
    RIGHT
}
enum Format {
    NORMAL,
    BOLD,
    ITALIC
}
record BasicText(String text, Alignment align, Format format) implements ItemElement { }
record JakeStyleProjectText(String text, String tools) implements ItemElement { }
record BulletPoint(String text) implements ItemElement { }
record Padding(float size) implements ItemElement { }