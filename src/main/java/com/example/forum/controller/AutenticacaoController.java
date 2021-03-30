package com.example.forum.controller;

import com.example.forum.controller.form.LogimForm;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
    
    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody @Validated LogimForm form){
        System.out.println(form.getEmail());
        System.out.println(form.getSenha());
        return ResponseEntity.ok().build();
    }
}
