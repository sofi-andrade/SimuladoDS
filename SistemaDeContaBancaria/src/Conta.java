/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Conta {
    Double saldo ;
    
    public Conta(double saldo){
        this.saldo= saldo;
        
    }
    public void depositar(double valor){
        this.saldo = this.saldo - valor; 
        System.out.println("Deposito de "+ valor + " realizado com secesso");
    }
    public void sacar(double valor){
        this.saldo = this.saldo -valor;
        System.out.println("Saque de "+ valor + " realizado com secesso");
    } 
    
    public void info(){
        System.out.println("Saldo: " + this.saldo);
    }
}
