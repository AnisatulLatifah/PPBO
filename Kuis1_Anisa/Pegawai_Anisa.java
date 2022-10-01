/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pegawai_Anisa {
    private String nama, nip;
    private double gajiPokok,lembur,uangMakan,transport, totalGaji;
    private int jumlahJamKerja;
    
    public void setNama(String nama){
         this.nama = nama;
    }
    public void setNIP(String nip){
        this.nip = nip;
    }
    public void jumlahJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void setGajiPokok(){
        gajiPokok = (2000 * jumlahJamKerja);   
    }
    public void setLembur(){
        if(jumlahJamKerja > 7){
            lembur = ((jumlahJamKerja-7) * (gajiPokok * 1.5)) ;
        }else{
            lembur = 0;
        }
    }
    public void setUangMakan(){
        if(jumlahJamKerja >= 8){
            uangMakan = ((jumlahJamKerja-7) * 3500) ;
        }else{
            uangMakan = 0;
        }
    }
    public void setTransport(){
        if(jumlahJamKerja >= 9){
            transport = ((jumlahJamKerja-8) * 4000) ;
        }else{
            transport = 0;
        }
    }
    public void hitungGajiHarian(){
         totalGaji = gajiPokok + lembur + uangMakan + transport;
    }
    public void cetakPenghasilan(){
        System.out.println("NIP            : "+nip);
        System.out.println("Nama           : "+nama);
        System.out.println("Jam Kerja      : "+jumlahJamKerja);
        System.out.println("Gaji Pokok     : "+gajiPokok);
        System.out.println("Uang Lembur    : "+lembur);
        System.out.println("Uang Makan     : "+uangMakan);
        System.out.println("Uang Transport : "+transport);
        System.out.println("Total Gaji     : "+totalGaji);
        System.out.println("");
    }
}
