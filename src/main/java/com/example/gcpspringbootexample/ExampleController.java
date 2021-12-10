package com.example.gcpspringbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RequestMapping("/example")
@RestController
public class ExampleController {

    @GetMapping
    public Map<String, String> getSomeStuff() {
        return Map.of(
                "name", "tony",
                "age", "none of your business",
                "favouriteCheese", "manchego");
    }
}
