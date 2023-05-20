package guru.springframework.sfgdi.strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MallardDuck extends Duck {

	@Autowired
	private FlyBehavior mallardFlyBehavior;

	public MallardDuck(final FlyBehavior mallardFlyBehavior) {
		this.mallardFlyBehavior = mallardFlyBehavior;
	}

	public MallardDuck() {}

	@Override
	public void fly() {
		mallardFlyBehavior.fly();
	}
	@Override
	public void setFlyBehavior(final FlyBehavior mallardFlyBehavior) {
		this.mallardFlyBehavior = mallardFlyBehavior;
	}
}
