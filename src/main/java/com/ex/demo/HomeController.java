package com.ex.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "Hello, Spring boot!";
    }
}
