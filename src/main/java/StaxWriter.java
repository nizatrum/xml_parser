import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StaxWriter {
    public static void main(String[] args) {
        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter("autoGenerate.xml"));

            writer.writeStartDocument("utf-8", "1.0");
            writer.writeCharacters("\n");
            writer.writeStartElement("books");
            writer.writeCharacters("\n    ");

            for (int i = 1; i < 4; i++) {
                writer.writeStartElement("book");
                writer.writeCharacters("\n        ");

                writer.writeStartElement("title");
                writer.writeCharacters("Some name book with number № " + i);
                writer.writeEndElement();
                writer.writeCharacters("\n        ");

                writer.writeStartElement("author");
                writer.writeCharacters("Some author book with number № " + i);
                writer.writeEndElement();
                writer.writeCharacters("\n        ");

                writer.writeStartElement("countPage");
                writer.writeCharacters("134" + i);
                writer.writeEndElement();
                writer.writeCharacters("\n    ");

                writer.writeEndElement();
                if (i < 3) {
                    writer.writeCharacters("\n    ");
                }
                else {
                    writer.writeCharacters("\n");
                }
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();

        } catch (XMLStreamException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
