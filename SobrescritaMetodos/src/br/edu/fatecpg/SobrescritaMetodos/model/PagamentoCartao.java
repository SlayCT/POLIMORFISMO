package br.edu.fatecpg.SobrescritaMetodos.model;

public class PagamentoCartao extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartao de credito");
    }
}
