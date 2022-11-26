/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;
public class Mahasiswa {
   protected String nama;
   
   public Mahasiswa(String nama){
       this.nama = nama;
   }
   public void kuliahDiKampus(){
       System.out.println("Aku mahasiswa, namaku "+this.nama);
       System.out.println("Aku berkuliah di kampus.");
   }
}
