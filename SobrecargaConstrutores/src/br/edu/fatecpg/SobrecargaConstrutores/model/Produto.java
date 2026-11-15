package br.edu.fatecpg.SobrecargaConstrutores.model;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    // Primeiro construtor
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }

    // Segundo construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    // Terceiro construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("----------------------");
    }
}