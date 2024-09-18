package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    private List<Curso> cursosMatriculados;

    public Aluno(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cursosMatriculados = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public List<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void matricularEmCurso(Curso curso) {
        cursosMatriculados.add(curso);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + ''' +
                ", email='" + email + ''' +
                ", cursosMatriculados=" + cursosMatriculados +
                '}';
    }
}
