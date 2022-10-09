/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.tugas;
public class Wahana {
    private String namaWhn;
    private Pengunjung pengunjung;
    
    public Wahana(String namaWhn, Pengunjung pengunjung){
        this.namaWhn = namaWhn;
        this.pengunjung = pengunjung;
    }
    public void setNamaWhn(String namaWhn){
        this.namaWhn = namaWhn;
    }
    public String getNamaWhn(){
        return namaWhn;
    }
    public void setPengunjung(Pengunjung pengunjung){
        this.pengunjung = pengunjung;
    }
    public Pengunjung getPengunjung(){
        return pengunjung;
    }
    public String info() { String info = "";
        info += "Nama Wahana: " +this.namaWhn + "\n";
        info += "Pengunjung : " +this.pengunjung + "\n";
        return info;
    }
}
