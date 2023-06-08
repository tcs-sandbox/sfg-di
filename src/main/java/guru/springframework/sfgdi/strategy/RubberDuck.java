package guru.springframework.sfgdi.strategy;

import org.springframework.stereotype.Component;
@Component
public class RubberDuck extends Duck {

	private FlyBehavior noFlyBehavior;
	public RubberDuck(final FlyBehavior noFlyBehavior) {

		this.noFlyBehavior = noFlyBehavior;
	}
	@Override
	public void fly() {

		noFlyBehavior.fly();
	}
	@Override
	public void setFlyBehavior(final FlyBehavior noFlyBehavior) {

		this.noFlyBehavior = noFlyBehavior;
	}
}
