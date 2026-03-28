/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Veiculo {
    String marca; 
    String capacidadeCarga;
    
    public Veiculo(String marca, String capacidadeCarga ){
        this.marca = marca;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirInfo(){
        System.out.println("----GERENCIAMENTO DDE VEICULOS DE CARGA----");
        System.out.println("Marca do veiculo: "+ marca);
        System.out.println("Capacidade de carga: " + capacidadeCarga);
    }
}
