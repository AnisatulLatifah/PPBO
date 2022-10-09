/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2Karyawan;
public class Karyawan {
    private String id,nama,jenisK,jabatan;
    private int gaji;
    
    public void getId(String newValue){
       id = newValue;
   }
   public void getNamaKaryawan(String newValue){
       nama = newValue;
   }
   public void getJenisK(String newValue){
       jenisK = newValue;
   }
   public void getJabatan(String newValue){
       jabatan = newValue;
   }
   public void getGaji(int newValue){
       gaji = newValue;
    }   
   public void tampilData(){
       System.out.println("ID Karyawan      : "+id);
       System.out.println("Nama             : "+nama);
       System.out.println("Jenis Kelamin    : "+jenisK);
       System.out.println("Jabatan          : "+jabatan);
       System.out.println("Gaji             : "+gaji);
   }
}
