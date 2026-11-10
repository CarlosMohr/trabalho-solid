package futuro.prato;

import saborexpress.prato.Prato;

// Combo: preço base com 15% de desconto
public class Combo extends Prato {

    public Combo(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase, tempoPreparo);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 0.85;
    }
}
