package br.edu.fatecpg.SobrescritaPolimorfismo.model;

public class Carro extends Veiculo {

    @Override
    public void mover() {
        System.out.println("O carro está dirigindo");
    }
}