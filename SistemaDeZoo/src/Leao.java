/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Leao extends Animal {
        public Leao(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }
    @Override
    public void info(){    
        System.out.println("---Sistema de animal---");
        System.out.println("Nome :" + nome );
        System.out.println("Idade: " + idade );
        System.out.println("Habitat :" + habitat);    
        
}   
    @Override
    public void emitirSom(){
        System.out.println("A o leão está rugindo!");
        
    }

}
