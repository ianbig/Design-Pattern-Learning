#include <iostream>

class Shape;
class Rectangle;
class Circle;

class VisitorInterface {
  public:
  virtual void visitShape(Shape & s) = 0;
  virtual void visitRectangle(Rectangle & r) = 0;
  virtual void visitCircle(Circle & c) = 0;
};

class JsonExporter : public VisitorInterface {
  public:
  virtual void visitShape(Shape & s) {}
  virtual void visitRectangle(Rectangle & r) {}
  virtual void visitCircle(Circle & c) {
    std::cout << "JSON: export Circle" << std::endl;
  }
};
class XMLExported : public VisitorInterface {
  public:
  virtual void visitShape(Shape & s) {}
  virtual void visitRectangle(Rectangle & r) {}
  virtual void visitCircle(Circle & c) {
    std::cout << "XML: export Circle" << std::endl;
  }
};

class Shape {
  public:
  virtual void draw() {
    std::cout << "Shape draw" << std::endl;
  }

  virtual void accept(VisitorInterface & visitor) = 0;
};

class Rectangle : public Shape {
  public:
  virtual void draw() override {
    std::cout << "Rec draw" << std::endl;
  }

  virtual void accept(VisitorInterface & visitor) override {
    visitor.visitRectangle(*this);
  }
};

class Circle : public Shape {
  public:
  virtual void draw() override {
    std::cout << "Circle draw" << std::endl;

  }

  virtual void accept(VisitorInterface & visitor) override {
    visitor.visitCircle(*this);
  }
};

int main() {
  JsonExporter js;
  XMLExported xml;

  Circle c;
  c.accept(js);
  c.accept(xml);
}