package FastFood;

public class Item {
  public int price;
  public String name;

  public Item(int _price, String _name) {
    price = _price;
    name = _name;
  }

  @Override
  public String toString() {
    return "Item " + name + "with price " + price;
  }

  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other != null && other.getClass().equals(getClass())) {
      Item otherItem = (Item)other;
      return otherItem.name.equals(name) && otherItem.price == price;
    }

    return false;
  }


}
