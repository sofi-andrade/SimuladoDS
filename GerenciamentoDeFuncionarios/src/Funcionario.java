/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Funcionario {
    String nome; 
    double salario;
    
    public Funcionario(String nome, double salario ){
        this.nome = nome; 
        this.salario = salario; 
    }
    
    public void exibirInfo(){
        System.out.println("----- Sistema de funcionarios -----");
        System.out.println("Nome: " + nome );
        System.out.println("Salario: " + salario);
    }
    
}
