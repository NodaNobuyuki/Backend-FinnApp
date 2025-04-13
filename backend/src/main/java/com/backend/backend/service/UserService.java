// esse arquivo apenas serve para simular uma database minúscula, armazenando usuários e senhas em memória. 
// permite textar o funcionamento do login através do frontend. 

package com.backend.backend.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService { 

    
    private Map<String, String> users = new HashMap<>();

    public UserService() {
        users.put("admin", "admin");
        users.put("corinthians", "corinthians");
    }

// negão perfuminho

    public boolean validate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}