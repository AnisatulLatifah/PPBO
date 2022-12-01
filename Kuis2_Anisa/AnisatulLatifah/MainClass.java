/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnisatulLatifah;
public class MainClass {
    public static void main(String[] args){
        
        TyrannosaurusRex trex = new TyrannosaurusRex();
        System.out.println("===========Dinosaurus==================");
        System.out.println("===TyrannosaurusRex===");
        trex.berjalan();
        trex.makan();
        System.out.println();
        
        Triceratops tcr = new Triceratops();
        System.out.println("===Triceratops===");
        tcr.berjalan();
        tcr.makan();
        Oviraptor ovp = new Oviraptor();
        System.out.println();
        
        System.out.println("===Oviraptor===");
        ovp.berjalan();
        ovp.makan();
        System.out.println();
        System.out.println();
        
        System.out.println("=========Pemburu=========");
        Pemburu pemburu = new Pemburu();
        pemburu.berburu(trex);
        System.out.println();
        System.out.println("=======Anak Pemburu======");
        AnakPemburu apm = new AnakPemburu();
        apm.mengambilTelur(trex);
    }
}
