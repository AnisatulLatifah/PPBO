/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;
public class Sepeda {
    private String merk;
    private int kecepatan;
    private int gear;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void gantiGear(int newValue){
        gear = newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void rem(int decrement){
        kecepatan = kecepatan - decrement; 
    }
    public void cetakStatus(){
        System.out.println("Merk : " +merk);
        System.out.println("Kecepatan : " +kecepatan);
        System.out.println("Gear : " +gear);
    }
}
