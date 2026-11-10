package saborexpress.prato;

// Prato executivo: preço base puro
public class PratoExecutivo extends Prato {

    public PratoExecutivo(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase, tempoPreparo);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }
}
