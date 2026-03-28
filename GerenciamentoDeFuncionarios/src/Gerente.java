/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Gerente extends Funcionario {
    String departamento;
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento; 
        
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("----- Sistema de funcionarios -----");
        System.out.println("Nome: " + nome );
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }
    
}
