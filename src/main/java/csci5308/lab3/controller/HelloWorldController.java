package csci5308.lab3.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}