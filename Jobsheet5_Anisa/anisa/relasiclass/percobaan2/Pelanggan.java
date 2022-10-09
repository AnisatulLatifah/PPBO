/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.percobaan2;
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    Pelanggan(){
    }
    Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari){
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
        public Mobil getMobil(){
        return mobil;
    }
    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }
        public Sopir getSopir(){
        return sopir;
    }
        public void sethari(int hari) {
        this.hari = hari;
    }
    public int getHari(){
        return hari;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) +
        sopir.hitungBiayaSopir(hari);
    } 
}
