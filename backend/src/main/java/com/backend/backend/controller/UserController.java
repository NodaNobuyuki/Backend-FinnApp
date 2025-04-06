package com.backend.backend.controller;

import com.backend.backend.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user){
        System.out.println("filho da puta");
        return ResponseEntity.ok("usuario filho da puta");

    }
}
