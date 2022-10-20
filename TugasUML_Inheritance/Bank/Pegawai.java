/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class Pegawai extends Bank{
    public String nip;
    public int gaji;
    
    public Pegawai(){
    }
    public Pegawai(String nama, String nik,String alamat, String jk, String nip, int gaji){
        super(nama,nik,alamat,jk);
        this.nip=nip;
        this.gaji=gaji;
    }
    public void tampilDataPegawai(){
        super.tampilDataBank();
        System.out.println("NIP             : "+nip);
        System.out.println("Gaji            : "+gaji);
    }
}
