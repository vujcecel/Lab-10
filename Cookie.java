public class Cookie {
  private int size;
  private int temp;
  private int time;
  private boolean baked;

  Cookie() {
    size = 0;
    temp = 0;
    time = 0;
    baked = false;
  }

  Cookie(int size, int temp, int time) {
    this.size = size;
    this.temp = temp;
    this.time = time;
    baked = false;
  }

  boolean isBaked() {
    return baked;
  }

  void setSize(int size) {
    this.size = size;
  }

  void bake(int temp, int time) {
    System.out.printf("%d cookies were baked at %d degrees F for %d minutes%n", size, temp, time);
    baked = true;
  }
}