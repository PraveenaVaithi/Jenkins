package Jenkins.Pipeline.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JenkinsApplication {

	public static void main(String[] args) {

		System.out.println("Hello World!!!!!!!!!!!!!!!!!!!!!!!");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
