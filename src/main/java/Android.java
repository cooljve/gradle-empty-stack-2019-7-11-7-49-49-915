public class Android extends Mobile {
  private final String ANDROID = "<Android>";
  private int maxMessageLength = 10;

  public Android(String name, String color, String brand) {
    super(name, color, brand);
  }

  public void call(String message) {
    if (message.length() > maxMessageLength) {
      System.out.print(ANDROID + " Message cannot be sent");
    } else {
      System.out.print(ANDROID + "Message: " + message);
    }
  }
}
