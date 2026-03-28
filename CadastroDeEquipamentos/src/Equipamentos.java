/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Equipamentos {
    String nomeEquipamento; 
    String modeloEquipamento; 
    
    public Equipamentos(String nomeEquipamento, String modeloEquipamento){
        this.nomeEquipamento = nomeEquipamento ; 
        this.modeloEquipamento = modeloEquipamento ; 
    }
    
    public void exibirDados(){
        System.out.println("-----GERENCIAMENTO DE EQUIPAMENTOS-----");
        System.out.println("Nome do equipamento: " + this.nomeEquipamento);
        System.out.println("Modelo do equipamento: "+ this.modeloEquipamento);
    }
}
