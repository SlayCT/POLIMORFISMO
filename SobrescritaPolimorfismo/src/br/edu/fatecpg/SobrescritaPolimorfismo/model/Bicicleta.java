package br.edu.fatecpg.SobrescritaPolimorfismo.model;

public class Bicicleta extends Veiculo {

    @Override
    public void mover() {
        System.out.println("A bicicleta está pedalando");
    }
}