/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class TugasMain {
    public static void main(String[] args){
        Dosen dsn = new Dosen("214176", "Nisa", "Magetan");
        dsn.setSKS(12);
        dsn.getGaji();

        Pegawai pgw = new Pegawai("6567654", "Anisa", "Malang");
        DaftarGaji dg = new DaftarGaji(1);
        dg.addPegawai(dsn);
        dg.addPegawai(pgw);
        dg.printSemuaGaji();
        
    }
}
