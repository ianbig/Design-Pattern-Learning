package FastFood;

import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
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
            if (currentItem.getNodeName().equals("item")) {
                AbstractMap.SimpleEntry<Item, Integer> tmp =  getItemFromDom(currentItem);
                order.addItem(tmp.getKey(), tmp.getValue(), Order.genorderId++);
            }
        }

        return order;
    }

    private AbstractMap.SimpleEntry<Item, Integer> getItemFromDom(Node curNode) {
        NodeList itemList = curNode.getChildNodes();
        int length = itemList.getLength();

        String itemName = null;
        Integer price = 0;
        Integer amount = 0;
        for (int i = 0; i < length; i++) {
            Node currentNode = itemList.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                String value = currentNode.getFirstChild().getNodeValue();
                if (currentNode.getNodeName().equals("name")) {
                    itemName = value;
                } else if (currentNode.getNodeName().equals("price")) {
                    price = Integer.parseInt(value);
                } if (currentNode.getNodeName().equals("amount")) {
                    amount = Integer.parseInt(value);
                }
            }
        }

        Item item = new Item(price, itemName);
        AbstractMap.SimpleEntry<Item, Integer> pair = new AbstractMap.SimpleEntry<>(item, amount);
        return pair;
    }
}
