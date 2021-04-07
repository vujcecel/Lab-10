public class Sugar extends Cookie {
  String shape;
  boolean decorated;

  Sugar() {
    this("");
  }

  Sugar(String shape) {
    this.shape = shape;
    decorated = false;
  }

  String getShape() {
    return shape;
  }

  void setShape(String shape) {
    this.shape = shape;
  }

  void cut(String shape, int size) {
    System.out.printf("%d cookies cut into %s%n", size, shape);
    super.setSize(size);
  }

  void decorate() {
    if (super.isBaked()) {
      decorated = true;
      System.out.println("The cookies have been decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}