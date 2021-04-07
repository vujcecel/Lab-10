class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("tree");
    tree.cut(tree.getShape(), 10);
    tree.bake(350, 12);
    tree.decorate();

    Sugar aCookie = new Sugar();
    aCookie.decorate();
  }
}