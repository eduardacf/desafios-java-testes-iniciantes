package com.exemplo;

import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Date data;
    private List<String> produtos;
    private double valorTotal;

    public Venda(int id, Date data, List<String> produtos, double valorTotal) {
        this.id = id;
        this.data = data;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", data=" + data +
                ", produtos=" + produtos +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
