package FastFood;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader extends AbstractReader {
    @Override
    public boolean validate() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Order read(String filepath) {
    Document doc = readXmlToDom(filepath);
    Order order = readFromDocument(doc);
    return order;
    }

    private Document readXmlToDom(String filepath) {
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            doc = builder.parse(new File(filepath));
            doc.normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return doc;
    }

    private Order readFromDocument(Document doc) {
        Order order = new Order();

        NodeList itemsList =  doc.getElementsByTagName("order").item(0).getChildNodes();
        int numberOfItems = itemsList.getLength();

        for (int i = 0; i < numberOfItems; i++) {
            Node currentItem = itemsList.item(i);
            if(currentItem.getNodeType() == Node.ELEMENT_NODE) {
                if (currentItem.getNodeName().equals("item")) {
                    // HashMap<Item, Integer> tmp =  getItemFromDom(currentItem);
                    // for (Map.Entry<Item, Integer> entry : tmp.entrySet()) {
                    //     order.addItem(entry.getKey(), entry.getValue(), 0);
                    // }
                }

                System.out.println(currentItem);
            }
        }

        return order;
    }

    private HashMap<Item, Integer> getItemFromDom(Node curNode) {
        NodeList itemList = curNode.getChildNodes();
        int length = itemList.getLength();

        String item = null;
        Integer price = 0;
        Integer amount = 0;
        for (int i = 0; i < length; i++) {
            Node currentNode = itemList.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                if (currentNode.getNodeName().equals("name")) {
                    System.out.println(currentNode);
                } else if (currentNode.getNodeName().equals("price")) {
                    System.out.println(currentNode.getNodeValue());
                } if (currentNode.getNodeName().equals("amount")) {
                    System.out.println(currentNode.getNodeValue());
                }
            }
        }

        HashMap<Item, Integer> retMap = new HashMap<>();
        return retMap;
    }
}
