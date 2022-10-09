/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.percobaan3;
public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(){  
    }
    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    public String getNIP(){
        return nip;
    }
    public void setNIP(String nip) {
        this.nip = nip;
    }
     public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String info() { String info = "";
        info += "Nip  : " +this.nip + "\n";
        info += "Nama : " +this.nama + "\n";
        return info;
    }
}
