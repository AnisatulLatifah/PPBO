/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3Lingkaran;
public class LingkaranMain {
    public static void main(String[] args){
        
        Lingkaran ling1 = new Lingkaran();
        
        ling1.getPhi(3.14);
        ling1.getRadius(8);
        ling1.getLuas();
        ling1.getKeliling();
        ling1.tampilDataLingkaran();
        System.out.println("Luas      : "+ling1.getLuas());
        System.out.println("Keliling  : "+ling1.getKeliling()); 
    }
}
