package com.example.myfirstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/")
public class PersonController {

    @GetMapping("/")
    public String indexPage(){
        return "home";
    }

}
