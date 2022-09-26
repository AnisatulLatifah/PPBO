/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;
public class Kulkas {
    private String merk;
    private String warna;
    private int suhu;
    
    public void getMerk(String input){
        merk = input;
    }
    public void getWarna(String input){
        warna = input;
    }
    public void tambahDingin(int newValue){
        suhu = suhu - newValue;
    }
    public void kurangiDingin(int newValue){
        suhu = newValue + suhu;
    }
    public void printStatus(){
        System.out.println("Merk    : "+merk);
        System.out.println("Warna   : "+warna);
        System.out.println("Suhu    : "+suhu);
    }
}
