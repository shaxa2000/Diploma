package kz.careerguidance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class CareerGuidanceApplication {
	private final PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(CareerGuidanceApplication.class, args);
	}

}
