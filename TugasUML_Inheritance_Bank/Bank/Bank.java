/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class Bank {
    public String nama, nik,alamat,jk;
    
    public Bank(){
    }
    public Bank(String nama, String nik,String alamat, String jk){
        this.nama=nama;
        this.nik=nik;
        this.alamat=alamat;
        this.jk=jk;
    }
    public void tampilDataBank(){
        System.out.println("Nama            : "+nama);
        System.out.println("NIK             : "+nik);
        System.out.println("Alamat          : "+alamat);
        System.out.println("Jenis Kelamin   : "+jk);
    }
}
