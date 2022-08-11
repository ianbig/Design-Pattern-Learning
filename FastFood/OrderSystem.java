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
    String fileRootPath = "/Users/ian.liu/learning/Design-Pattern-Learning/FastFood";
    // JsonReader jsonReader = new JsonReader();
    // system.placeOrder(jsonReader, fileRootPath + "/customerA.json");
    
    XmlReader xmlReader = new XmlReader();
    system.placeOrder(xmlReader, fileRootPath + "/customerB.xml");
    // // display all orders
    // system.printOrders();
  }
}
