/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class PagamentoCartao extends Pagamento {
    String numCartao; 
    
    public PagamentoCartao(Double valor, String status, String numCartao) {
        super(valor, status);
        this.numCartao = numCartao; 
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("---Status de pagamento:");
        System.out.println("Pagamento realizado!");
        System.out.println("Numero do cartão " + this.numCartao );
        System.out.println("Valor do pagamento: " + valor );
        
    }
    
    @Override
     public void exibirStatus(){
        System.out.println("O status do seu cartão: " + status );
    } 
}
