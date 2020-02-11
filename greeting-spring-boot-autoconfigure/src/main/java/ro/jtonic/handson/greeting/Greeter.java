package ro.jtonic.handson.greeting;

public class Greeter {

  private final GreetingProperties greetingProperties;

  public Greeter(GreetingProperties greetingProperties) {
    this.greetingProperties = greetingProperties;
  }

  public String greet(String to) {
    return greetingProperties.getMessage() + " " + to;
  }
}
