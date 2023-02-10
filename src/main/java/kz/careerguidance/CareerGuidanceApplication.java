package kz.careerguidance;

import kz.careerguidance.entity.persons.Person;
import kz.careerguidance.role.Roles;
import kz.careerguidance.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class CareerGuidanceApplication {
	private final PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(CareerGuidanceApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void go() {
		personService.setPerson(new Person("Rozik", "ADMIN"));
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
