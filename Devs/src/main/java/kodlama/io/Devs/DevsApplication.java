package kodlama.io.Devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class DevsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevsApplication.class, args);
	}

}
