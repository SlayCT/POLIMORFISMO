package br.edu.fatecpg.SobrecargaConstrutores.view;
import br.edu.fatecpg.SobrecargaConstrutores.model.*;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa");

        Produto produto2 = new Produto("Calça", 89.90);

        Produto produto3 = new Produto("Tênis", 150.00, 10);

        produto1.mostrarInformacoes();
        produto2.mostrarInformacoes();
        produto3.mostrarInformacoes();
    }
}