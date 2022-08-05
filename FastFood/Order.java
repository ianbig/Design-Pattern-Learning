package FastFood;

import java.util.HashMap;
import java.util.Map;

public class Order {
  private HashMap<Item, Integer> items;
  private int orderId;

  public void addItem(Item item, Integer amounts, int orderId) {
    items.put(item, amounts);
  }
  
  @Override
  public String toString() {
    String orderString = "orderId " + orderId;
    for (Map.Entry<Item, Integer> entry : items.entrySet()) {
      orderString += "item: " + entry.getKey() + "has amount: " + entry.getValue();
    }

    return orderString;
  }

  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj.getClass().equals(getClass())) {
      Order other = (Order)obj;
      return other.orderId == orderId;
    }

    return false;
  }
}
