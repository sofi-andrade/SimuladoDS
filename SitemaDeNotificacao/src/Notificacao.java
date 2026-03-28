/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Notificacao {
    String destinatario;
    String mensagem; 
    
    public Notificacao(String destinatario,String mensagem){
        this.destinatario = destinatario;
        this.mensagem = mensagem; 
    }
    
    public void info(){
        System.out.print("-----Sistema de envio de mensagem----");
        System.out.println("Destinatario: " + destinatario);
        System.out.print("Mensagem: " + mensagem );
    }
    
    public void enviar(){
        System.out.println("Mensagem enviada!! \n ");
    }
        
}
