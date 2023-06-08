package guru.springframework.sfgdi.strategy;

import org.springframework.stereotype.Component;
@Component
public class MallardFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {

		System.out.println("I fly like a Mallard");
	}
}
