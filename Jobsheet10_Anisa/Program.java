/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;
public class Program {
    public static void main(String[] args){
        
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang anisa = new Orang ("Anisa");
        Orang ifa = new Orang("Ifa");
        
        anisa.peliharaHewan(kucingKampung);
        ifa.peliharaHewan(lumbaLumba);
        
        anisa.ajakPeliharaanJalanJalan();
        ifa.ajakPeliharaanJalanJalan();
    }
}
