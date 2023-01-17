package com.example.springbootactuatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class DemoRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
