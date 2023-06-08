package guru.springframework.sfgdi.strategy;

import org.springframework.stereotype.Component;
@Component
public class NoFlyBehavior implements FlyBehavior{
	@Override
	public void fly() {

		System.out.println("I don't fly!");
	}
}
