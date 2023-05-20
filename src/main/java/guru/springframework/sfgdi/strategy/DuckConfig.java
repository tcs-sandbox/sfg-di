package guru.springframework.sfgdi.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DuckConfig {

	@Bean
	public DuckClient duckClient() {
		return new DuckClient();
	}
	@Bean
	public MallardDuck mallardDuck(final FlyBehavior mallardFlyBehavior) {
		return new MallardDuck(mallardFlyBehavior);
	}
	@Bean
	public FlyBehavior mallardFlyBehavior() {
		return new MallardFlyBehavior();
	}
	@Bean
	public RubberDuck rubberDuck(final FlyBehavior rubberDuckFlyBehavior) {
		return new RubberDuck(rubberDuckFlyBehavior);
	}

	@Bean
	public FlyBehavior rubberDuckFlyBehavior() {
		return new NoFlyBehavior();
	}
}
