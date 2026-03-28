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
        Usuario u1 = new Usuario("SOFI@GMAIL.COM", "10101" , "ADIM", true); 
        u1.info();
        u1.autenticar("10101");
        u1.desativar();
    
    }
    
}
