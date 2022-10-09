/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2Karyawan;
public class karyawanMain {
     public static void main(String[] args){
        
        Karyawan kry1 = new Karyawan();
        
        kry1.getId("12345");
        kry1.getNamaKaryawan("Latifa");
        kry1.getJenisK("Perempuan");
        kry1.getJabatan("Manager");
        kry1.getGaji(20000000);
        kry1.tampilData();
     }
}
