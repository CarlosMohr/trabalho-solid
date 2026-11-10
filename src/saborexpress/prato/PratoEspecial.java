<<<<<<< HEAD
package saborexpress.prato;
=======
import saborexpress.prato.Prato;
>>>>>>> 52e62661e14dc3e37ff5d057e4637087499ec911

// Prato especial: preço base + custo do ingrediente premium
public class PratoEspecial extends Prato {
    private double custoPremium;

    public PratoEspecial(String nome, double precoBase, int tempoPreparo, double custoPremium) {
        super(nome, precoBase, tempoPreparo);
        this.custoPremium = custoPremium;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + custoPremium;
    }
}
