package guru.springframework.sfgdi.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DuckConfig {

	/* This is a different way of doing things but I'm not entirely sure this is correct anymore.
	It seems like with Component Scan being able to auto-locate beans by the @Component annotation
	and by name and/or type we no longer need a configuration like this newing everything up manually

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
	*/

}
