package br.edu.fatecpg.SobrecargaMetodosConversao.model;

public class Conversor {

    // Celsius para Fahrenheit
    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Quilometros para milhas
    public double converter(int quilometros) {
        return quilometros * 0.621371;
    }

    // Texto para letras maiusculas
    public String converter(String texto) {
        return texto.toUpperCase();
    }
}