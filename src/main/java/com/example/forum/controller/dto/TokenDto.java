package com.example.forum.controller.dto;

public class TokenDto {

    private String tipo;
    private String token;

    public TokenDto(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getToken() {
        return this.token;
    }

}
