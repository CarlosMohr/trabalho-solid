<<<<<<< HEAD
package saborexpress.prato;
=======
import saborexpress.prato.Prato;
>>>>>>> 52e62661e14dc3e37ff5d057e4637087499ec911

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
