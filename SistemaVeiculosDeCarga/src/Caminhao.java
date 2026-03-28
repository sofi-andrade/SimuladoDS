/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Caminhao extends Veiculo {
     int numEixo; 
     
    public Caminhao(String marca, String capacidadeCarga, int numEixo) {
        super(marca, capacidadeCarga);
        this.numEixo = numEixo; 
        
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("----GERENCIAMENTO DDE VEICULOS DE CARGA----");
        System.out.println("Marca do veiculo: "+ marca);
        System.out.println("Numero de eixo: "+ numEixo);
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
    
}
