package com.example.myfirstspring.repository;

import com.example.myfirstspring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    // We are extending this JpaRepository interface which will provide us access to the in-built crud(create, read, update , delete)
    // methods. in JpaRepository< TypeParameter, primaryKeyDataType>
   // TypeParameter = which table or what model class we are using
    //primaryKeyDataType
}
