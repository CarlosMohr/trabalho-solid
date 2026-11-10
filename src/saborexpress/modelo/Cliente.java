package saborexpress.modelo;

// Criando objeto cliente
public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    // Cria o cliente com nome, endereço e telefone
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
