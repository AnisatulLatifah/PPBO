/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class Manager extends Pegawai{
    public int tunjangan;
    
    
    public Manager(){
    }
    public Manager(String nama, String nik,String alamat, String jk, String nip, int gaji, int tunjangan){
    super(nama,nik,alamat,jk,nip,gaji);
    this.tunjangan=tunjangan;
}
    public void tampilDataManager(){
        System.out.println("==============Data Manager=============");
        super.tampilDataPegawai();
        System.out.println("Tunjangan       : "+tunjangan);
        System.out.println("Gaji Total      : "+(super.gaji+tunjangan));
    }
}
