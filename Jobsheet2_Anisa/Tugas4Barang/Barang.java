/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4Barang;
public class Barang {
    private String kode,namaBarang;
    private int hargaDasar;
    private float diskon;

    public void getKode(String newValue){
        kode = newValue;
    }
    public void namaBarang(String newValue){
        namaBarang = newValue;
    }
    public void hargaDasar(int newValue){
        hargaDasar = newValue;
    }
    public void diskon(float newValue){
        diskon = newValue;
    }
    public float hitungHargaJual(){
        float hargaJual = hargaDasar - (diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode    : "+kode);
        System.out.println("Nama    : "+namaBarang);
        System.out.println("Harga   : "+hargaDasar);
        System.out.println("Diskon  : "+diskon);
    }
}
