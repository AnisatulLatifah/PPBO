/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceLatihan;

/**
 *
 * @author User
 */
public class Cow extends AnimalFood implements InterfaceAnimal{
    
    public Cow(String namaMakanan){
        super(namaMakanan);
    }
    
    @Override
    public void animalSound(){
        System.out.println("The Cow says: Mooo mooo");
    }
    
    @Override
    public void sleep(){
        System.out.println("Zzzzzzz");
    }
}
