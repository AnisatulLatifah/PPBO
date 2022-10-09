/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.percobaan2;
public class Mobil {
    private String merk;
    private int biaya;
    
    Mobil(){  
    }
    Mobil(String merk, int biaya){
        this.merk = merk;
        this.biaya = biaya;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public int getBiaya(){
        return biaya;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
