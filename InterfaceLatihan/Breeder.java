/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceLatihan;

/**
 *
 * @author User
 */
public class Breeder {
    
    public void memberiMakan(InterfaceAnimal AnimalFood){
        
        System.out.println("I am a breeder, giving food to my farm animals");
        System.out.println("Finally, my cattle have been fed");
        
        AnimalFood.animalSound();
        AnimalFood.sleep();
        
        System.out.println("-------------------------------------------------------");
    }
}
