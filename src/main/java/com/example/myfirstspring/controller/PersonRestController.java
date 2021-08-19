package com.example.myfirstspring.controller;

import com.example.myfirstspring.models.Person;
import com.example.myfirstspring.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person/api")
public class PersonRestController {

    private final PersonService personService;

    public PersonRestController(PersonService personService) {          //constructor for dependency injection
        this.personService = personService;
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personService.getAllPerson();
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }

}
