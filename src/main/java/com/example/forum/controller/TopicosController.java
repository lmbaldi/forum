package com.example.forum.controller;

import java.util.List;

import com.example.forum.form.TopicoForm;
import com.example.forum.modelo.Topico;
import com.example.forum.repository.CursoRepository;
import com.example.forum.repository.TopicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<TopicoDto> lista(String nomeCurso){
        if(nomeCurso == null){
            return listarTopicos();
        }else{
            return listarCursoPorNome(nomeCurso);
        }
    }

    private List<TopicoDto> listarCursoPorNome(String nomeCurso) {
        List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
        return TopicoDto.converter(topicos);
    }

    private List<TopicoDto> listarTopicos() {
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }

    @PostMapping
    public void cadastrar(@RequestBody TopicoForm form){
        Topico topico = form.converter(cursoRepository);
        topicoRepository.save(topico);
    }
    
}
