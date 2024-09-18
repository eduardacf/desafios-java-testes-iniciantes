package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    public void marcarTarefaComoConcluida(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setStatus("concluída");
                break;
            }
        }
    }

    public List<Tarefa> listarTarefasPendentes() {
        List<Tarefa> pendentes = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().equals("pendente")) {
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }
}
