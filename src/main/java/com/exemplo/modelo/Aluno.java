package com.exemplo.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Aluno {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  geração automatica
    private Long id;

    private String nome;
    private String email;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @ManyToMany(mappedBy = "alunos")
    private Set<Curso> cursos = new HashSet<>();

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
}