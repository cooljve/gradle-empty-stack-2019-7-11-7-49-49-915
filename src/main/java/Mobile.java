public class Mobile {
  private String name;
  private String color;
  private String brand;

  public Mobile(String name, String color, String brand) {
    this.name = name;
    this.color = color;
    this.brand = brand;
  }

  public void call(String message) {
    System.out.print("Message: " + message);
  }

  @Override
  public String toString() {
    return "name: " + name +
        ", color: " + color +
        ", brand: " + brand;
  }
}
