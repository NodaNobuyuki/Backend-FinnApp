package com.backend.backend.model;

public class Request {
    private String username;
    private String password;

    // Construtor cria um objeto vazio. Necessário quando spring boot mapeia um json para essa classe
    public Request() {}
    
    public Request(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters e Setters: Getters permitem vizualizar o valor, setters permitem alterar o valor
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
