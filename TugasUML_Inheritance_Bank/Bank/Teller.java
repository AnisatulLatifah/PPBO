/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class Teller extends Pegawai{
    public int bonus, lembur, potongan;
    
    public Teller(){
    }
    public Teller(String nama, String nik,String alamat, String jk, String nip, int gaji, int bonus, int lembur, int potongan){
        super(nama,nik,alamat,jk,nip,gaji);
        this.bonus=bonus;
        this.lembur=lembur;
        this.potongan=potongan;
    }
    public void tampilDataTeller(){
                System.out.println("==============Data Teller=============");
        super.tampilDataPegawai();
        System.out.println("Bonus           : "+bonus);
        System.out.println("Lembur          : "+lembur);
        System.out.println("Potongan        : "+potongan);
        System.out.println("Total Gaji      : "+(super.gaji+bonus+lembur-potongan));
    }
}
