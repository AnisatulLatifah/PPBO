/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.tugas;
public class Tiket {
    private String kode;
    private Wahana wahana;
    private Pengunjung pengunjung;
    private Petugas petugas;
    
    Tiket(){
        
    }
    public Tiket(String kode, Wahana wahana, Pengunjung pengunjung, Petugas petugas){
        this.kode = kode;
        this.wahana = wahana;
        this.pengunjung = pengunjung;
        this.petugas = petugas;
    }

    public void setkode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void setWahana(Wahana wahana){
        this.wahana = wahana;
    }
    public Wahana getWahana(){
        return wahana;
    }
    public void setPengunjung(Pengunjung pengunjung){
        this.pengunjung = pengunjung;
    }
    public Pengunjung getPengunjung(){
        return pengunjung;
    }
    public void setPetugas(Petugas petugas){
        this.petugas = petugas;
    }
    public Petugas getPetugas(){
        return petugas;
    }
    public String info() { String info = "";
        info += "Kode Tiket     : " +this.kode + "\n";
        info += "Nama Wahana    : " +this.wahana.getNamaWhn() + "\n";
        info += "Nama Pengunjung: " +this.pengunjung.getNama() + "\n";
        info += "Nama Petugas   : " +this.petugas.getNamaP() + "\n";
        return info;
    }
}
