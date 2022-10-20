/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class Nasabah extends Bank{
    public String noRekening;
    public int saldo,bunga;
    
    public Nasabah(){
    }
    public Nasabah(String nama, String nik,String alamat, String jk, String noRekening, int saldo, int bunga){
        super(nama, nik, alamat,jk);
        this.noRekening=noRekening;
        this.saldo=saldo;
        this.bunga=bunga;
    }
    public void tampilDataNasabah(){
        super.tampilDataBank();
        System.out.println("No. rekening    : "+noRekening);
        System.out.println("Saldo           : "+saldo);
        System.out.println("Bunga           : "+bunga);
        System.out.println("Total Tabungan  : "+(saldo-bunga));
    }
}
