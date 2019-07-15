public class iPhone extends Mobile {

  private final String IPHONE = "<iPhone>";
  private int maxMessageLength = 5;

  public iPhone(String name, String color, String brand) {
    super(name, color, brand);
  }

  public void call(String message) {
    if (message.length() > maxMessageLength) {
      System.out.print(IPHONE+" Message cannot be sent");
    } else {
      System.out.print(IPHONE + "Message: " + message);
    }
  }
}
