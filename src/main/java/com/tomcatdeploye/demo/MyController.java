package com.tomcatdeploye.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home(){
        return "Hi This is home response !!!";
    }
}
