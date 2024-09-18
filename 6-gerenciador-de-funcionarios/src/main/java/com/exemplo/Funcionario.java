package com.exemplo;

public class Funcionario {
    private int id;
    private String nome;
    private String email;
    private Departamento departamento;

    public Funcionario(int id, String nome, String email, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + ''' +
                ", email='" + email + ''' +
                ", departamento=" + departamento +
                '}';
    }
}
