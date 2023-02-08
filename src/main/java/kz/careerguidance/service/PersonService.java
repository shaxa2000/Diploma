package kz.careerguidance.service;


import jakarta.persistence.EntityNotFoundException;
import kz.careerguidance.entity.persons.Person;
import kz.careerguidance.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public Person getById(Long id){
        return personRepository.findById(id).orElseThrow(()->
        {
            throw new EntityNotFoundException("Person not found");
        });
    }

    public void setPerson(Person person){
        personRepository.save(person);
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
