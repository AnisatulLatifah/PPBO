/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class NasabahUmum extends Nasabah{
    public String idNasabahUmum;
    
    public NasabahUmum(){
    }
    public NasabahUmum(String nama, String nik,String alamat, String jk, String noRekening, int saldo, int bunga, String idNasabahUmum){
        super(nama, nik, alamat,jk,noRekening,saldo,bunga);
        this.idNasabahUmum=idNasabahUmum;
    }
    public void tampilDataNasabahUm(){
                System.out.println("==============Data Nasabah Umum=============");
        System.out.println("ID Nasabah Umum : "+idNasabahUmum);
        super.tampilDataNasabah();
    }
}
