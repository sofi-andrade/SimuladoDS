/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class ItemBiblioteca {
    String titulo;
    String autor; 
    
    public ItemBiblioteca (String titulo,String autor ){
        this.autor = autor ; 
        this.titulo = titulo; 
    }
    public void exibirInfo() {
         System.out.println("-----SISTEMA DE BIBLIOTECA-----");
         System.out.println("Titulo: "+ titulo);
         System.out.println("Autor : " + autor );
}
}
