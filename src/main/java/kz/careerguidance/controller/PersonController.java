package kz.careerguidance.controller;

import kz.careerguidance.dto.persons.PersonDto;
import kz.careerguidance.entity.persons.Person;
import kz.careerguidance.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    private final ModelMapper modelMapper;


    @GetMapping("/getPersonById")
    public PersonDto getById(
            @RequestParam Long id
    ){
        return new PersonDto();
    }



    public PersonDto convertToPersonDTO(Person person) {
        return modelMapper.map(person, PersonDto.class);
    }
    public Person convertToPerson(PersonDto personDTO) {
        return modelMapper.map(personDTO, Person.class);
    }

}
