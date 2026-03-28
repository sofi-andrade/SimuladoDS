/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Livro extends ItemBiblioteca {
    int numPag; 
    public Livro(String titulo, String autor,int numPag) {
        super(titulo, autor);
        this.numPag = numPag; 
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("-----SISTEMA DE BIBLIOTECA-----");
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor : " + autor );  
        System.out.println("Numero de paginas: "+ numPag);
    }
}
