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
        Email m1 = new Email("robertaAlves@gmail.com ", "Boa noite! Havera uma reuniao amanhã as 10:00");
        Sms m2 = new Sms(" Bruno", "Oi, tudo bem? ");
        
        m1.info();
        m1.enviar();
        m2.info();
        m2.enviar();
    }
    
    
}
