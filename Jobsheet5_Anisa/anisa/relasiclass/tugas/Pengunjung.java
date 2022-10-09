/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.tugas;
public class Pengunjung {
    private String nama;
    private int usia;
    
    public Pengunjung(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }
    public int getUsia(){
        return usia;
    }
    public String info() { String info = "";
        info += "Nama  : " +this.nama + "\n";
        info += "Usia : " +this.usia + "\n";
        return info;
    }
}
