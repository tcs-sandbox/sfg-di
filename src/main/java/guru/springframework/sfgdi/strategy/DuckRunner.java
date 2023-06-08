package guru.springframework.sfgdi.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DuckRunner implements CommandLineRunner {

	@Autowired
	private DuckClient duckClient;

	public static void main(String[] args) {

		System.out.println("Running DuckRunner...");
		SpringApplication.run(DuckRunner.class, args);

		// See note in DuckConfig.class - A @Configuration annotated class isn't required
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(DuckConfig.class);
		//DuckClient duckClient = ctx.getBean(DuckClient.class);
		//duckClient.run();
	}

	@Override
	public void run(final String... args) throws Exception {
		duckClient.run();
	}
}
