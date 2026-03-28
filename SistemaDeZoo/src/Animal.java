/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Animal {
    String nome;
    int idade; 
    String habitat; 
    
    public Animal(String nome, int idade, String habitat ){
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat; 
        
    }
    public void info(){
        System.out.println("---Sistema de animal---");
        System.out.println("Nome :" + nome );
        System.out.println("Idade: " + idade );
        System.out.println("Habitat :" + habitat);
    }
    
    public void emitirSom(){
        System.out.println("muu");
        
}}
