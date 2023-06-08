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
	}
}
