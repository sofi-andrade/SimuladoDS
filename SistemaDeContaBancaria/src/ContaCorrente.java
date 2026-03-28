/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class ContaCorrente  extends Conta{
    double limite; 
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }
    
    
    @Override
    public void depositar(double valor){
        this.saldo = this.saldo - valor; 
        System.out.println("Deposito de "+ valor + " realizado com secesso");
    }
        
    @Override
    public void sacar(double valor){
       Double  totDisponivel = (this.saldo + this.limite);  
       
        if( valor <= totDisponivel ){
        this.saldo = totDisponivel - valor;
        System.out.println("Saque de "+ valor + " realizado com secesso");
        
        }else{
                System.out.println("Saldo indiponivel");
                }
    } 
    
    @Override
    public void info(){
        System.out.println("Saldo: " + this.saldo);
    }
}
