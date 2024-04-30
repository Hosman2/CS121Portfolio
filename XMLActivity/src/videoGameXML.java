import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class videoGameXML {
    public static void main(String[] args) {
        try{
            File input = new File("videoGames.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList videoGameList = doc.getElementsByTagName("videoGame");

            for(int i = 0; i < videoGameList .getLength(); i++){
                Node node = videoGameList .item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Type: " + element.getElementsByTagName("type").item(0).getTextContent());
                    System.out.println("Released: " + element.getElementsByTagName("released").item(0).getTextContent());
                    System.out.println();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
