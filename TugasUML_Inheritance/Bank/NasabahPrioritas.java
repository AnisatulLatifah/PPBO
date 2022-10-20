/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class NasabahPrioritas extends Nasabah{
    public String idPrioritas, namaRuangan;
    
    public NasabahPrioritas(){
    }
     public NasabahPrioritas(String nama, String nik,String alamat, String jk, String noRekening, int saldo, int bunga, String idPrioritas, String namaRuangan){
        super(nama, nik, alamat,jk,noRekening,saldo,bunga);
        this.idPrioritas=idPrioritas;
        this.namaRuangan=namaRuangan;
    }
    public void tampilDataNsbPrio(){
                System.out.println("==============Data Nasabah Prioritas=============");
        System.out.println("ID Prioritas    : "+idPrioritas);
        System.out.println("Nama Ruangan    : "+namaRuangan);
        super.tampilDataNasabah();
    }
}
