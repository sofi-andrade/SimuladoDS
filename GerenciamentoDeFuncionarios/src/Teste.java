/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gerente f1 = new Gerente("Valeria", 3000, "Financeiro");
       Funcionario f2 = new Funcionario("Vitor", 1000);
       f1.exibirInfo();
       f2.exibirInfo();
    }
    
}
