/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Peminjaman;
public class Peminjaman {
   private String id,namaMember,namaGame;
   private int harga,lamaSewa;
   
   public void getId(String newValue){
       id = newValue;
   }
   public void getNamaMember(String newValue){
       namaMember = newValue;
   }
   public void getNamaGame(String newValue){
       namaGame = newValue;
   }
   public int hargaSewa(int hargaBayar){
      harga = hargaBayar;
      return harga;
   }
   public int LamaSewa(int totalJam){
       lamaSewa = totalJam;
       return lamaSewa;
   }
   public int totalBayar(){
       int totalBayar = harga * lamaSewa;
       return totalBayar;
   }
   public void printStatus(){
       System.out.println("ID           : "+id);
       System.out.println("Nama Member  : "+namaMember);
       System.out.println("Nama Game    : "+namaGame);
       System.out.println("Harga Sewa   : "+harga);
      
   }
}
