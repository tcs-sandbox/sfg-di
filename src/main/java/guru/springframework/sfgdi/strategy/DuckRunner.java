package guru.springframework.sfgdi.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
public class DuckRunner {

	public static void main(String[] args) {

		System.out.println("Running DuckRunner...");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DuckConfig.class);
		DuckClient duckClient = ctx.getBean(DuckClient.class);
		duckClient.run();
	}
}
