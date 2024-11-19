package com.exemplo.populator;

import com.exemplo.modelo.Curso;
import com.exemplo.dto.CursoDTO;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CursoPopulator {


    private Date date;
    LocalDate localDate = date.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();


    // Método para converter a entidade Curso para o DTO CursoDTO
    public static CursoDTO toDTO(Curso curso) {
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setId(curso.getId());
        cursoDTO.setNome(curso.getNome());
        cursoDTO.setDescricao(curso.getDescricao());
        cursoDTO.setDataCriacao(curso.getDataCriacao());
        return cursoDTO;
    }

    // Método para converter o DTO CursoDTO para a entidade Curso
    public static Curso toEntity(CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setId(cursoDTO.getId());
        curso.setNome(cursoDTO.getNome());
        curso.setDescricao(cursoDTO.getDescricao());
        curso.setDataCriacao(cursoDTO.getDataCriacao());
        return curso;
    }
}
