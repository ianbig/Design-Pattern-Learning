package OopBasic;

public class Square extends Shape {
  private int length;
  Square(int _length) {
    length = _length;
  }

  @Override
  public int area() {
    return length * length;
  }
}
