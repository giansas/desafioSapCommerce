package com.exemplo.controlador;

import com.exemplo.modelo.Aluno;
import com.exemplo.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // indica controlador REST
@RequestMapping("/alunos") //   rota base = /alunos
public class AlunoControlador {


    /*
    *
    * POST /alunos - cadastrar
    * GET /alunos - listar alunos
    * GET /alunos/{id} - buscar aluno pelo id
    *
    */
    @Autowired
    private AlunoRepositorio alunoRepositorio;


    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoRepositorio.save(aluno);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Aluno buscarAluno(@PathVariable Long id) {
        return alunoRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}
