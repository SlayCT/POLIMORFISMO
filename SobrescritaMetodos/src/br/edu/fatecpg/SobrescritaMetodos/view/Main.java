package br.edu.fatecpg.SobrescritaMetodos.view;
import br.edu.fatecpg.SobrescritaMetodos.model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pagamento pagamento;

        System.out.println("\n===== FORMAS DE PAGAMENTO =====");
        System.out.println("1 - Cartao de credito");
        System.out.println("2 - Boleto bancario");
        System.out.print("Escolha uma opcao: ");

        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                pagamento = new PagamentoCartao();
                pagamento.processarPagamento();
                break;

            case 2:
                pagamento = new PagamentoBoleto();
                pagamento.processarPagamento();
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        sc.close();
    }
}
