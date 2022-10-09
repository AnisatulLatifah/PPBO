/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.tugas;
public class MainTugas {
    public static void main(String[] args){
        Pengunjung pengunjung = new Pengunjung("Anisa",20);
        Petugas petugas = new Petugas("12345","Bayu");
        Wahana wahana = new Wahana("Bianglala", pengunjung);
        Tiket tiket = new Tiket("123", wahana, pengunjung, petugas);
        System.out.println(tiket.info());
    }
}
