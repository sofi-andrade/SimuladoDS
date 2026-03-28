/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Sms extends Notificacao {
    
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
    
    @Override
    public void info(){
        System.out.println("-----Sistema de envio de mensagem----");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensagem: " + mensagem );
    }  
    
    @Override
    public void enviar(){
        System.out.println("O SMS foi enviado!! \n ");
    }
    
}
