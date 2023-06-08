package guru.springframework.sfgdi.strategy;
import org.springframework.stereotype.Component;

@Component
public class MallardDuck extends Duck {

	private FlyBehavior mallardFlyBehavior;

	public MallardDuck(final FlyBehavior mallardFlyBehavior) {

		this.mallardFlyBehavior = mallardFlyBehavior;
	}

	@Override
	public void fly() {

		mallardFlyBehavior.fly();
	}
	@Override
	public void setFlyBehavior(final FlyBehavior mallardFlyBehavior) {

		this.mallardFlyBehavior = mallardFlyBehavior;
	}
}
