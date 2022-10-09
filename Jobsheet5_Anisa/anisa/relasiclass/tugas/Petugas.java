/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.tugas;
public class Petugas {
    private String nik;
    private String namaP;
    
    public Petugas(String nik, String namaP){
        this.nik = nik;
        this.namaP = namaP;
    }
    public void setNamaP(String namaP){
        this.namaP = namaP;
    }
    public String getNamaP(){
        return namaP;
    }
    public void setNIK(String nik){
        this.nik = nik;
    }
    public String getNIK(){
        return nik;
    }
    public String info() { String info = "";
        info += "NIK         : " +this.nik+ "\n";
        info += "Nama Petugas: " +this.namaP + "\n";
        return info;
    }
}
