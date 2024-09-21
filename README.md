# Ben's Resume

Modern engineering-style resume template written in Java (generates a PDF). For more information on why I created this resume template check out my [blog post](https://ben.enterprises/java-resume) (soon™).

## VSCode Usage (Recommended):

Install [JDK 21](https://adoptium.net/temurin/releases/?version=21&package=jdk) and [VSCode](https://code.visualstudio.com/) as well as the [Red Hat Java Language Server](https://marketplace.visualstudio.com/items?itemName=redhat.java) and [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug) VSCode extensions. Open this directory and click the `Run` button in `MyResume.java` to generate a pdf file.

## CLI Usage:

Install [JDK 21](https://adoptium.net/temurin/releases/?version=21&package=jdk) and [Maven](https://maven.apache.org/install.html). Run `mvn clean compile exec:java` to generate a pdf file.

## Example:

[![Example resume](example/example-resume.svg)](example/example-resume.pdf)

## Credits:

Fonts: [Lato](https://fonts.google.com/specimen/Lato), [Source Serif 4](https://fonts.google.com/specimen/Source+Serif+4)

Icons: [Bootstrap Icons](https://icons.getbootstrap.com/)

PDF Geneartion: [PDFBox](https://pdfbox.apache.org/)

SVG Path Manipulation: [svgpathtools](https://pypi.org/project/svgpathtools/)