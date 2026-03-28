/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Computador extends Equipamentos {
    String processador; 
    public Computador(String nomeEquipamento, String modeloEquipamento, String processador) {
        super(nomeEquipamento, modeloEquipamento);
        this.processador =  processador;
    }
    
    @Override
    public void exibirDados(){
    System.out.println("-----GERENCIAMENTO DE EQUIPAMENTOS-----");
        System.out.println("Nome do equipamento: " + this.nomeEquipamento);
        System.out.println("Modelo do equipamento: "+ this.modeloEquipamento);
        System.out.println("Processador : " + this.processador ); 
}        
}
