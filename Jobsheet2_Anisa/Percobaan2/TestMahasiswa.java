/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;
public class TestMahasiswa {
    public static void main(String[] args){
        
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();        
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim=101;
        mhs1.nama="Anisa";
        mhs1.alamat="Magetan";
        mhs1.kelas="2F";
        mhs1.tampilData();
        System.out.println("");
        
        mhs2.nim=102;
        mhs2.nama="Angelina";
        mhs2.alamat="Probolinggo";
        mhs2.kelas="2F";
        mhs2.tampilData();
        System.out.println("");
        
        mhs3.nim=103;
        mhs3.nama="Ali";
        mhs3.alamat="Probolinggo";
        mhs3.kelas="2F";
        mhs3.tampilData();
        System.out.println("");
    }
}
