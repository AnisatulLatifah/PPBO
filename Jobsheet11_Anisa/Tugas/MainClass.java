/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class MainClass {
    public static void main(String[] args){
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe","Abu-Abu");
        keledai.displayData();
        System.out.println("");
        
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum","Hitam Manis");
        gorilla.displayData();
        System.out.println("");
        
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar","Coklat");
        singa.displayData();
        System.out.println("");
    }
}
