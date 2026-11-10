package saborexpress.pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import saborexpress.modelo.Cliente;
import saborexpress.prato.Prato;

// Pedido cliente: data e pratos na ordem em que foram escolhidos
public class Pedido {
    private Cliente cliente;
    private LocalDate data;
    private List<Prato> pratos = new ArrayList<>(); // ArrayList pra fica na ordem

    public Pedido(Cliente cliente, LocalDate data) {
        this.cliente = cliente;
        this.data = data;
    }

    // Adiciona um prato no fim da lista
    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    // Soma o preço de todos os pratos (cada um calcula o seu)
    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.calcularPreco();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
