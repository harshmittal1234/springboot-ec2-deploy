package com.example.myfirstsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MyfirstsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfirstsiteApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "This is my first website!";
    }
}

