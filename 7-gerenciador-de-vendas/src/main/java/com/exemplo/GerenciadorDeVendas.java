package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeVendas {
    private List<Venda> vendas;

    public GerenciadorDeVendas() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void removerVenda(int id) {
        vendas.removeIf(venda -> venda.getId() == id);
    }

    public void atualizarVenda(Venda vendaAtualizada) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId() == vendaAtualizada.getId()) {
                vendas.set(i, vendaAtualizada);
                break;
            }
        }
    }

    public List<Venda> listarVendasPorCliente(int clienteId) {
        List<Venda> vendasPorCliente = new ArrayList<>();
        for (Venda venda : vendas) {
            if (venda.getId() == clienteId) {
                vendasPorCliente.add(venda);
            }
        }
        return vendasPorCliente;
    }
}
