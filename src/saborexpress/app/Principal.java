package saborexpress.app;

import java.time.LocalDate;

import saborexpress.modelo.Cliente;
import saborexpress.pedido.ControlePedidos;
import saborexpress.pedido.Pedido;
import saborexpress.prato.Combo;
import saborexpress.prato.Prato;
import saborexpress.prato.PratoEspecial;
import saborexpress.prato.PratoExecutivo;

public class Principal {
    public static void main(String[] args) {
        // Controle único dos pedidos do dia
        ControlePedidos controle = new ControlePedidos();

        // Clientes
        Cliente ana = new Cliente("Ana", "Rua das Flores, 100", "(55) 99999-1111");
        Cliente bruno = new Cliente("Bruno", "Av. Brasil, 250", "(55) 99999-2222");

        // Pratos do cardápio (um de cada tipo)
        Prato executivo = new PratoExecutivo("Bife acebolado", 30.0, 20);
        Prato combo = new Combo("Hambúrguer + fritas + refri", 40.0, 15);
        Prato especial = new PratoEspecial("Risoto de camarão", 50.0, 35, 12.0);

        // Pedido da Ana
        Pedido pedido1 = new Pedido(ana, LocalDate.now());
        pedido1.adicionarPrato(executivo);
        pedido1.adicionarPrato(combo);

        // Pedido do Bruno
        Pedido pedido2 = new Pedido(bruno, LocalDate.now());
        pedido2.adicionarPrato(especial);
        pedido2.adicionarPrato(executivo);

        controle.adicionarPedido(pedido1);
        controle.adicionarPedido(pedido2);

        // Mostra os pedidos do dia
        for (Pedido pedido : controle.getPedidos()) {
            System.out.println("Cliente: " + pedido.getCliente().getNome() + " - " + pedido.getData());
            for (Prato prato : pedido.getPratos()) {
                System.out.println("  " + prato.getNome() + ": R$ " + String.format("%.2f", prato.calcularPreco()));
            }
            System.out.println("  Total: R$ " + String.format("%.2f", pedido.calcularTotal()));
            System.out.println();
        }
        System.out.println("Total do dia: R$ " + String.format("%.2f", controle.calcularTotalDoDia()));
    }
}
