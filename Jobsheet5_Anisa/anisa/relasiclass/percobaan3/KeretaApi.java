/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.percobaan3;
public class KeretaApi {
   private String nama;
   private String kelas;
   private Pegawai masinis;
   private Pegawai asisten;
   
   KeretaApi(){
   }
   public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
       this.nama = nama;
       this.kelas = kelas;
       this.masinis = masinis;
       this.asisten = asisten;
   }
    public KeretaApi(String nama, String kelas, Pegawai masinis){
       this.nama = nama;
       this.kelas = kelas;
       this.masinis = masinis;
   }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
     public Pegawai getMasisnis(){
        return masinis;
    }
    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }
    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }
    public String info(){
        String info = "";
        info += "Nama   : " +this.nama + "\n";
        info += "Kelas  : " +this.kelas + "\n";
        info += "Masinis: " +this.masinis.info() + "\n";
        info += "Asisten: " +this.asisten.info() + "\n";
        return info;
    }
        public String info2(){
        String info2 = "";
        info2 += "Nama   : " +this.nama + "\n";
        info2 += "Kelas  : " +this.kelas + "\n";
        info2 += "Masinis: " +this.masinis.info() + "\n";
        return info2;
    }
}
