package com.exemplo.repositorio;

import com.exemplo.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
}
