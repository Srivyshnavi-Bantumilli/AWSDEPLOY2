package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/home")
    public String disk() {
        return "welcome to cse jenkins";
    }

    @GetMapping("/home2")
    public String disk2() {
        return "welcome to aditya jenkins";
    }
}