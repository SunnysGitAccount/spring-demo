package dev.sunny.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String greetings() {
        return "Hello World!";
    }
}
