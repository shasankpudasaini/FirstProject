package com.example.myfirstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kkk")
public class PersonController {

    @GetMapping("/")
    public String indexPage(){
        return "home";
    }

}
