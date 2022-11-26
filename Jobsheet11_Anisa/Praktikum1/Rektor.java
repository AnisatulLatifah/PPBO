/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;
public class Rektor {
    
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        mahasiswa.dataMahasiswa();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("-----------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaiaman Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("------------------------------------------------");
    }
    
    
}
