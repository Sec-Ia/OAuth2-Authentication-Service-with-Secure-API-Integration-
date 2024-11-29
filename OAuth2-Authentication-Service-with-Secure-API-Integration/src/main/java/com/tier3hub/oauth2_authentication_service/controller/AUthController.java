package com.tier3hub.oauth2_authentication_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AUthController {
    @GetMapping("/hello")
    public String greet()
    {
        return "hello ayush!";
    }
}
