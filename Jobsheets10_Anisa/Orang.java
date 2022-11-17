/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    
    public Orang(String nama){
        this.nama = nama;
    }
    
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " +this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("------------------------------------------");
    }
}
