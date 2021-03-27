package com.example.forum.repository;

import java.util.List;

import com.example.forum.modelo.Topico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);
    
}
