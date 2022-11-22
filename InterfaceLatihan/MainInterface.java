/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceLatihan;
import InterfaceLatihan.InterfaceAnimal;
import InterfaceLatihan.Breeder;
import InterfaceLatihan.Cow;
import InterfaceLatihan.Pig;
import InterfaceLatihan.AnimalFood;

public class MainInterface {
    
    public static void main(String[] args) {
      
      Breeder breeder = new Breeder();
      
      AnimalFood animalfood = new AnimalFood("Grass");
      Cow cow = new Cow("Grass");
      Pig pig = new Pig("Grass");
      
//      breeder.memberiMakan(animalfood);
      breeder.memberiMakan(cow);
      breeder.memberiMakan(pig);
      
      
      
      
      
      
      

    }
}
