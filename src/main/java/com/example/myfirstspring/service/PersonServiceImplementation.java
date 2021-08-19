package com.example.myfirstspring.service;

import com.example.myfirstspring.models.Person;
import com.example.myfirstspring.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImplementation implements PersonService {

    // This is a service Class, we implement business logic in this class, here this implements method getALLPerson() as
    //business logic.
    // We need to annotate service, if we don't , then Spring can't recognize this class and make a bean out of it.


    private final PersonRepository personRepository;

    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPerson() {
        List<Person> personList = personRepository.findAll();     //returns list of person
        return personList;
    }

    @Override
    public Person save(Person person) {

        return personRepository.save(person);
    }
}
