package ml.samuel.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
		System.out.println("=====================================");
		System.out.println("service on : http://localhost:8080/");
		System.out.println("=====================================");
	}

}
