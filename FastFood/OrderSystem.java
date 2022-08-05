package FastFood;

import java.util.ArrayList;

public class OrderSystem {
  ArrayList<Order> ordersHistory;

  public Order placeOrder(AbstractReader reader, String filepath) {
    Order order = reader.read(filepath);
    ordersHistory.add(order);
    return order;
  }

  public void printOrders() {
      // TODO: add print logic
  }

  public static void main(String[] args) {
    OrderSystem system = new OrderSystem();

    JsonReader jsonReader = new JsonReader();
    system.placeOrder(jsonReader, "./customerA.json");
    
    // take in xml order
    XmlReader xmlReader = new XmlReader();
    system.placeOrder(xmlReader, "./customerB.xml");
    // display all orders
    system.printOrders();
  }
}
