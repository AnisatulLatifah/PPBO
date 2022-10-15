/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int tarifSKS = 100000;
    
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    public int getSKS(){
        return jumlahSKS;
    }
    public int getGaji(){
        int TotalGaji = jumlahSKS * tarifSKS;
        return TotalGaji + super.getGaji();
    }
}
