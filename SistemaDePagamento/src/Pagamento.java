/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Pagamento {
    String status ; 
    Double valor ; 
    
    public Pagamento( Double valor, String status ){
        this.valor = valor;
        this.status = status ; 
    }
    
    public void processarPagamento(){
        System.out.println("----Status de pagamento:");
        System.out.println("Valor do pagamento: " + valor );
    }
    
    public void exibirStatus(){
        System.out.println("O status do seu cartão: " + status );
    } 
}
