package com.exemplo.populator;

import com.exemplo.modelo.Aluno;
import com.exemplo.dto.AlunoDTO;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class AlunoPopulator {

    // Método para converter a entidade Aluno para o DTO AlunoDTO
    public static AlunoDTO toDTO(Aluno aluno) {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setId(aluno.getId());
        alunoDTO.setNome(aluno.getNome());
        alunoDTO.setEmail(aluno.getEmail());
        alunoDTO.setDataCadastro(aluno.getDataCadastro());
        return alunoDTO;
    }


    // Método para converter o DTO AlunoDTO para a entidade Aluno
    public static Aluno toEntity(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setId(alunoDTO.getId());
        aluno.setNome(alunoDTO.getNome());
        aluno.setEmail(alunoDTO.getEmail());
        aluno.setDataCadastro(alunoDTO.getDataCadastro());
        return aluno;
    }
}
