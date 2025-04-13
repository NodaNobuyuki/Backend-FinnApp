// Arquivo responsável pela autenticação do usuário. 

package com.backend.backend.controller;

import com.backend.backend.model.Request;
import com.backend.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController 
@RequestMapping("/auth")
public class AuthController { // marca essa classe como um controlador do REST API, significando que irá receber HTTP requests
                //Endpoint será POST /auth/login
    @Autowired
    private UserService userService;

    @PostMapping("/login") // Recebe a request do frontend
    public ResponseEntity<String> login(@RequestBody Request loginRequest) { // Diz ao spring para ler o json enviado pelo frontend, e o converte em objeto LoginRequest
        boolean isValid = userService.validate(loginRequest.getUsername(), loginRequest.getPassword());

        if (isValid) {
            return ResponseEntity.ok("Login com sucesso, negão perfuminho");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Vacilão errou a senha KKKKKKKKK");
        }
    }
}
