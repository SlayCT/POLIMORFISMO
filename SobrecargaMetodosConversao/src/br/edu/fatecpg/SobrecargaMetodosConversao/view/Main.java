package br.edu.fatecpg.SobrecargaMetodosConversao.view;
import br.edu.fatecpg.SobrecargaMetodosConversao.model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conversor conversor = new Conversor();

        int opcao;
        
        do {

	        System.out.println("\n===== CONVERSOR =====");
	        System.out.println("1 - Celsius para Fahrenheit");
	        System.out.println("2 - Quilometros para Milhas");
	        System.out.println("3 - Texto para Maiusculas");
	        System.out.print("Escolha uma opcao: ");
	
	        opcao = sc.nextInt();
	        sc.nextLine();
	
	        switch (opcao) {
	
	            case 1:
	                System.out.print("Digite a temperatura em Celsius: ");
	                double celsius = sc.nextDouble();
	
	                System.out.println("Resultado: "
	                        + conversor.converter(celsius) + " Fahrenheit");
	                break;
	
	            case 2:
	                System.out.print("Digite a distancia em quilometros: ");
	                int km = sc.nextInt();
	
	                System.out.println("Resultado: "
	                        + conversor.converter(km) + " milhas");
	                break;
	
	            case 3:
	                System.out.print("Digite um texto: ");
	                String texto = sc.nextLine();
	
	                System.out.println("Resultado: "
	                        + conversor.converter(texto));
	                break;
	
	            default:
	                System.out.println("Opcao invalida!");
	        }
        
        } while (opcao != 0);

        sc.close();
    }
}