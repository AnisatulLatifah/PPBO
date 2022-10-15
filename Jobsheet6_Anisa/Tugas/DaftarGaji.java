/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jmlPegawai;
    
     public DaftarGaji(int jmlPegawai){
        this.jmlPegawai = jmlPegawai;
        listPegawai = new Pegawai[jmlPegawai];
    }
    public void addPegawai(Pegawai pg){
        for (int i = 0; i < jmlPegawai; i++) {
            listPegawai[i] = pg;
            i++;
        }
    }
    public void printSemuaGaji(){
        for(int i = 0; i < jmlPegawai; i++){
            System.out.println("Pegawai ke- " +(i+1));
            System.out.println("NIP     : "+listPegawai[i].getNip());
            System.out.println("Nama    : "+listPegawai[i].getNama());
            System.out.println("Alamat  : "+listPegawai[i].getAlamat());
            System.out.println("Gaji    : "+listPegawai[i].getGaji());
        }
    }
}
