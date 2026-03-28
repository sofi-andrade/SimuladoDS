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
        Arara a1 = new Arara("lila", 20, "Floresta" );
        Leao l1 = new Leao("Simba", 10 , "Savana");
        
        a1.info();
        a1.emitirSom();
        l1.info();
        l1.emitirSom();
        
        
    }
    
}
