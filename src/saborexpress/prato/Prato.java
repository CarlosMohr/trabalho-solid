package saborexpress.prato;

// Base de todos os pratos: cada tipo calcula o próprio preço
public abstract class Prato {
    private String nome;
    private double precoBase;
    private int tempoPreparo; // em minutos

    public Prato(String nome, double precoBase, int tempoPreparo) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparo = tempoPreparo;
    }

    // Cada tipo de prato diz como calcula o seu preço
    public abstract double calcularPreco();

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }
}
