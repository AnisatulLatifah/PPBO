/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceLatihan;

/**
 *
 * @author User
 */
public class Pig extends AnimalFood implements InterfaceAnimal{
    
    public Pig(String namaMakanan){
        super(namaMakanan);
    }
    @Override
    public void animalSound(){
        System.out.println("The Pig says: Wee wee");
    }
    @Override
    public void sleep(){
        System.out.println("Zzzzz");
    }
    
}
