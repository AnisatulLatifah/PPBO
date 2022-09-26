/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;
public class KulkasShowCase {
    private String tipeKulkas;
    private int jumlahPintu;
    
    public void getTipeKulkas(String newValue){
        tipeKulkas = newValue;
    }
    public void getjumlahPintu(int newValue){
        jumlahPintu = newValue;
    }
    public void cetakStatus(){
        System.out.println("Tipe kulkas  : " +tipeKulkas);
        System.out.println("Jumlah Pintu : " +jumlahPintu);
    }
}
