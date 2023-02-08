package kz.careerguidance.controller;

import kz.careerguidance.dto.persons.PersonDto;
import kz.careerguidance.entity.persons.Person;
import kz.careerguidance.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    private final ModelMapper modelMapper;

    @GetMapping("/getById")
    public Person getById(
            @RequestParam Long id
    ) {
        return personService.getById(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Person>> getById() {
        List<Person> personDtos = modelMapper
                .map(
                        personService.getAll(),
                        new TypeToken<List<Person>>() {
                        }.getType());

        return new ResponseEntity<>(personDtos, HttpStatus.OK);
    }

    @PostMapping("/createPerson")
    public void createPerson(
            @RequestParam String name,
            @RequestParam String role
    ) {
        personService.setPerson(new Person(name, role));
    }

    public PersonDto convertToPersonDTO(Person person) {
        return modelMapper.map(person, PersonDto.class);
    }

    public Person convertToPerson(PersonDto personDTO) {
        return modelMapper.map(personDTO, Person.class);
    }

}
