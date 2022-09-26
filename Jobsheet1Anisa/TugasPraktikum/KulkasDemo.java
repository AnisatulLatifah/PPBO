/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;
public class KulkasDemo {
    public static void main(String[] args){
        
        Kulkas kulkas1 = new Kulkas();
        KulkasShowCase kulkasSC = new KulkasShowCase();
        
        kulkas1.getMerk("Panasonic");
        kulkas1.getWarna("Abu-abu");
        kulkas1.kurangiDingin(2);
        kulkas1.tambahDingin(3);
        kulkas1.printStatus();
        
        kulkasSC.getTipeKulkas("Show Case");
        kulkasSC.getjumlahPintu(2);
        kulkasSC.cetakStatus();
    }
}
