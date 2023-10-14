package com.example.ldaptutorial;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    
@GetMapping(value="/")
public String index() {
    return "Welcome to the home page!";
}
    
}
