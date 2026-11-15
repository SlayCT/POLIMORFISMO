package br.edu.fatecpg.SobrecargaPolimorfismo.model;

public class Calculadora {

    // Soma de dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Soma de três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Soma de dois decimais
    public double somar(double a, double b) {
        return a + b;
    }
}
