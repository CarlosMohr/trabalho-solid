package saborexpress.pedido;

import java.util.ArrayList;
import java.util.List;

// Controle único dos pedidos do dia
public class ControlePedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    // Registra um pedido no controle
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Soma o total de todos os pedidos do dia
    public double calcularTotalDoDia() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
