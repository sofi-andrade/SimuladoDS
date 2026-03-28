/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Usuario {
    String login;
    String senha; 
    String nivelAcesso;
    boolean ativo ;
    
    public Usuario (String login, String senha,  String nivelAcesso, boolean ativo  ){
        this.login=login ; 
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.ativo = ativo ;
        
        
    }
    
    public void info(){
        System.out.println("login: " + login); 
        System.out.println("Nivel de acesso: " + nivelAcesso);
    }
    
    public void autenticar(String senhaInformada){
        if (senhaInformada.equals(this.senha) && (this.ativo == true )){
        System.out.println("Usuario ativo e senha correta!!");
        }else {
            System.out.println("Senha incorreta ou usuario inativo ");     
        }
    }
    
    public void desativar(){
        this.ativo = false; 
        System.out.println("Status atualizado para : " + this.ativo );
    }            
}
