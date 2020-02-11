package ro.jtonic.handson.greeting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ro.jtonic.greeting")
public class GreetingProperties {

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Enable greeting
   */
  private boolean enable = false;

  /**
   * Greeting message
   */
  private String message = "";

  public String getMessage() {
    return message;
  }

  public boolean isEnable() {
    return enable;
  }
}
