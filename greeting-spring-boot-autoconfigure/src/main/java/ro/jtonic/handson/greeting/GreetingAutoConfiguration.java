package ro.jtonic.handson.greeting;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreetingProperties.class)
@ConditionalOnClass(Greeter.class)
@ConditionalOnProperty(name = "ro.jtonic.greeting.enable", matchIfMissing = true, havingValue = "true")
public class GreetingAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public Greeter greeting(GreetingProperties greetingProperties) {
    return new Greeter(greetingProperties);
  }
}
