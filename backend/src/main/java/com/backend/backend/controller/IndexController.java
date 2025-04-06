package com.backend.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class IndexController {
    @RestController
    public class HelloController {
        @GetMapping("/")
        public String hello() {
            return "API está online!";
        }
    }
}
