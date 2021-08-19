package com.example.myfirstspring.service;

import com.example.myfirstspring.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPerson();
    Person save(Person person);

}
