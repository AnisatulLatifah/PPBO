/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceLatihan;

/**
 *
 * @author User
 */
public class AnimalFood{
    protected String namaMakanan;
    
    public AnimalFood(String namaMakanan){
        this.namaMakanan = namaMakanan;
    }

    public void LifeIn(){
        System.out.println("I'm Animal, my food is " +this.namaMakanan);
        System.out.println("I live in a yard.");
    }
}

