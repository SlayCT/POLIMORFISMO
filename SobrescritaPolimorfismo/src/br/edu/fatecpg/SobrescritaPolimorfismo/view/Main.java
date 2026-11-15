package br.edu.fatecpg.SobrescritaPolimorfismo.view;
import br.edu.fatecpg.SobrescritaPolimorfismo.model.*;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}