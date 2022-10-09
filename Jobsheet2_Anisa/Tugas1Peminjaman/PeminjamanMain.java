/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Peminjaman;
public class PeminjamanMain {
    public static void main(String[] args){
        
        Peminjaman anggota1 = new Peminjaman();
        
        anggota1.getId("12345");
        anggota1.getNamaMember("Anisa");
        anggota1.getNamaGame("Mandi Bola");
        anggota1.hargaSewa(50000);
        anggota1.LamaSewa(4);
        anggota1.printStatus();
        System.out.println("Total Bayar  : "+anggota1.totalBayar());
    }
}
