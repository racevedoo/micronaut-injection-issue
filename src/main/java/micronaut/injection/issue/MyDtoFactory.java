package micronaut.injection.issue;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class MyDtoFactory {
  @Singleton
  @Bean
  MyDto myDto1() {
    return new MyDto(1);
  }

  @Singleton
  @Bean
  MyDto myDto2() {
    return new MyDto(2);
  }
}
