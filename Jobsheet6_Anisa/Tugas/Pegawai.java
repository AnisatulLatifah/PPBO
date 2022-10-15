/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class Pegawai{
    public String nip;
    public String nama;
    public String alamat;

    public Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getNip(){
        return nip;
    }
     public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
     public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getGaji(){
        return 5000000;
    }
}
