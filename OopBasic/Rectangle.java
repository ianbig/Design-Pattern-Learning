package OopBasic;

public class Rectangle extends Shape {
  private int width;
  private int length;

  Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  @Override
  public int area() {
    return width * length;
  }
}
