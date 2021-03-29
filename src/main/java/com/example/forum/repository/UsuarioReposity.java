package com.example.forum.repository;

import java.util.Optional;

import com.example.forum.modelo.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioReposity extends JpaRepository<Usuario, Long> {
    
    Optional<Usuario> findByEmail(String email);
}
