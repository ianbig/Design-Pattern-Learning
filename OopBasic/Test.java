package OopBasic;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {
  public ArrayList<Shape> shapes;

  Test() {
    shapes = new ArrayList<Shape>();
  }
  public static void main(String [] args) {
    Test test = new Test();
    test.shapes.add(new Rectangle(10, 5));
    test.shapes.add(new Square(10));

    ListIterator<Shape> iterator = test.shapes.listIterator();
    while (iterator.hasNext()) {
      int shapeArea = iterator.next().area();
      System.out.println("Area is " + shapeArea);
    }
  }
}