/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4Barang;
import java.util.Scanner;
public class BarangMain {
    public static void main(String[] args){

        Barang brg = new Barang();
        
        brg.getKode("123");
        brg.namaBarang("Kipas Angin");
        brg.hargaDasar(100000);
        brg.diskon((float) 0.25);
        brg.tampilData();
        System.out.println("Bayar   : "+brg.hitungHargaJual());
        }
    }

