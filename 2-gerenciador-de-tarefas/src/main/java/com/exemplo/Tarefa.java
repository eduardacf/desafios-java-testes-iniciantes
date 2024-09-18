package com.exemplo;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String status; // "pendente" ou "concluída"

    public Tarefa(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "pendente";
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + ''' +
                ", descricao='" + descricao + ''' +
                ", status='" + status + ''' +
                '}';
    }
}
