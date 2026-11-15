package br.edu.fatecpg.SobrecargaPolimorfismo.view;
import br.edu.fatecpg.SobrecargaPolimorfismo.model.*;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma de dois inteiros: "
                + calculadora.somar(10, 20));

        System.out.println("Soma de três inteiros: "
                + calculadora.somar(10, 20, 30));

        System.out.println("Soma de dois doubles: "
                + calculadora.somar(10.5, 20.5));
    }
}
