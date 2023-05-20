package guru.springframework.sfgdi.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RubberDuck extends Duck {

	@Autowired
	private FlyBehavior rubberDuckFlyBehavior;
	public RubberDuck(final FlyBehavior rubberDuckFlyBehavior) {
		this.rubberDuckFlyBehavior = rubberDuckFlyBehavior;
	}
	@Override
	public void fly() {
		rubberDuckFlyBehavior.fly();
	}
	@Override
	public void setFlyBehavior(final FlyBehavior rubberDuckFlyBehavior) {
		this.rubberDuckFlyBehavior = rubberDuckFlyBehavior;
	}
}
