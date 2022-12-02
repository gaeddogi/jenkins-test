package com.example.jenkinstest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("")
    public String main() {
        return "Hello Jenkins, today is.. 졸려!";
    }

    @RequestMapping("/polling-test")
    public String polling() {
        return "polling test이다";
    }
}
