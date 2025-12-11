import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;

import java.io.File;
public class Csv {
    public static void main(String[] args) {
        try {
            System.out.printf("Hello and welcome!\n");

            File stylesheet = new File("/home/packiaida/Downloads/ratecurve (1).xsl");
            File xmlSource = new File("/home/packiaida/Downloads/rtcu.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlSource);
            StreamSource styleSource = new StreamSource(stylesheet);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(styleSource);
            Source source = new DOMSource(document);
            Result outputTarget = new StreamResult(new File("/home/packiaida/Downloads/rate.csv"));
            transformer.transform(source, outputTarget);
            System.out.println("Transformation completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
