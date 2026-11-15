package br.edu.fatecpg.SobrescritaMetodos.model;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via boleto bancario");
    }
}