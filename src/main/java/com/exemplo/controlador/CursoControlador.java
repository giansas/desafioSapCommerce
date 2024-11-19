package com.exemplo.controlador;

import com.exemplo.modelo.Curso;
import com.exemplo.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    /*
        POST /cursos: Cadastrar curso.
        GET /cursos: Listar todos os cursos.
        GET /cursos/{id}: Buscar curso pelo ID.
     */

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @PostMapping
    public Curso cadastrarCurso(@RequestBody Curso curso) {
        return cursoRepositorio.save(curso);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Curso buscarCurso(@PathVariable Long id) {
        return cursoRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }
}
