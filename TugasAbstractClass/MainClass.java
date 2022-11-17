/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class MainClass {
    public static void main(String[] args){
        
        Manusia m = new Manusia();
        Mawar  mw = new Mawar();
        Belalang b = new Belalang();
        
        System.out.println("===Manusia===");
        m.bernafas();
        m.bergerak();
        m.rataRataUsiaHidup();
        m.hobi();
        System.out.println();
        
        System.out.println("===Mawar===");
        mw.bernafas();
        mw.bergerak();
        mw.rataRataUsiaHidup();
        mw.warna();
        System.out.println();
        
        System.out.println("===Belalang===");
        b.bernafas();
        b.bergerak();
        b.rataRataUsiaHidup();
        System.out.println();
    }
}
