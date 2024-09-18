package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFuncionarios {
    private List<Funcionario> funcionarios;

    public GerenciadorDeFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int id) {
        funcionarios.removeIf(funcionario -> funcionario.getId() == id);
    }

    public void atualizarFuncionario(Funcionario funcionarioAtualizado) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == funcionarioAtualizado.getId()) {
                funcionarios.set(i, funcionarioAtualizado);
                break;
            }
        }
    }

    public List<Funcionario> listarFuncionariosPorDepartamento(int departamentoId) {
        List<Funcionario> funcionariosPorDepartamento = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento().getId() == departamentoId) {
                funcionariosPorDepartamento.add(funcionario);
            }
        }
        return funcionariosPorDepartamento;
    }
}
