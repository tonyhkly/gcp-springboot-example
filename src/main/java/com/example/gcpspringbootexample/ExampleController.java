package com.example.gcpspringbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class ExampleController {

    @GetMapping("/")
    public String getHomePage() {
        return "<html><body><h1>Hello Tony...!!</h1></body></html>";
    }

    @GetMapping("/example")
    public Map<String, String> getSomeStuff() {
        return Map.of(
                "name", "tony",
                "age", "none of your business",
                "favouriteCheese", "manchego");
    }
}
