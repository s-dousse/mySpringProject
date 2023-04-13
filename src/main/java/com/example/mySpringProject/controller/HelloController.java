package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @ mark an annotation: built-in units of Spring code hat make complex functionality readily available in Spring applications
@RestController
public class HelloController {

  @GetMapping("/helloworld")
  public String helloWorld() {
    return "Hello World!";
  }
}
