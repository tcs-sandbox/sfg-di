package guru.springframework.sfgdi.strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DuckClient {

	@Autowired
	private Duck mallardDuck;

	@Autowired
	private Duck rubberDuck;

	public void run() {
		System.out.println("Mallard Duck...");
		mallardDuck.fly();
		System.out.println("Rubber Duck...");
		rubberDuck.fly();
		System.out.println("Mallard Duck that can't fly...");
		Duck mallardWithNoFlying = new MallardDuck();
		mallardWithNoFlying.setFlyBehavior(new NoFlyBehavior());
		mallardWithNoFlying.fly();
	}
}
