package kz.careerguidance.service;

import jakarta.persistence.EntityNotFoundException;
import kz.careerguidance.entity.persons.Person;
import kz.careerguidance.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public Person getById(Long id){
        return personRepository.findById(id);
    }
}
