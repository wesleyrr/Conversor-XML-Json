package conversor;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ImprimeXMLnoConsole {
	
	
    public void imprime(String path) {

        try {
        	//lê arquivo xml
            File fXmlFile = new File(path);
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Noticia");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    //System.out.println("id : " + eElement.getAttribute("id"));
                    System.out.println("Titulo : "+ eElement.getElementsByTagName("Titulo").item(0).getTextContent());
                    System.out.println("Subtitulo : " + eElement.getElementsByTagName("Subtitulo").item(0).getTextContent());
                    System.out.println("Data : " + eElement.getElementsByTagName("Data").item(0).getTextContent());
                    System.out.println("DataBusca : "+ eElement.getElementsByTagName("DataBusca").item(0).getTextContent());
                    System.out.println("Conteúdo : "+ eElement.getElementsByTagName("content").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}