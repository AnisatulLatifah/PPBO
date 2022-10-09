/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.percobaan4;
public class Gerbong {
   private String kode;
   private Kursi[] arrayKursi;
   
   private void initKursi(){
      for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1)); 
   }
   }
   Gerbong(String kode, int jumlah){
       this.kode = kode;
       arrayKursi = new Kursi[jumlah];
       this.initKursi();
   }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
//    public void setPenumpang(Penumpang penumpang, int nomor) {
//        if(this.arrayKursi[nomor-1].getPenumpang() != null) {
//            System.out.println("Kursi "+nomor+" Telah di Booking");
//            System.out.println("Kursi telah dibooking oleh " +penumpang.getNama());
//        }else{
//            this.arrayKursi[nomor-1].setPenumpang(penumpang);
//        }
//    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        if(this.arrayKursi[nomor-1].getPenumpang() == null){
            this.arrayKursi[nomor-1].setPenumpang(penumpang);
        }else{
            System.out.println("Kursi"+nomor+"Telah dibooking");
            System.out.println("Kursi telah diboooking oleh : " +penumpang.getNama());
        }
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
}
}
