package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAlunos {
    private List<Aluno> alunos;

    public GerenciadorDeAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }

    public void matricularAlunoEmCurso(int alunoId, Curso curso) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == alunoId) {
                aluno.matricularEmCurso(curso);
                break;
            }
        }
    }

    public List<Aluno> listarAlunosMatriculadosEmCurso(int cursoId) {
        List<Aluno> matriculados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            for (Curso curso : aluno.getCursosMatriculados()) {
                if (curso.getId() == cursoId) {
                    matriculados.add(aluno);
                    break;
                }
            }
        }
        return matriculados;
    }
}
