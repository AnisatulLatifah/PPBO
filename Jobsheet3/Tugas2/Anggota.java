/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;
public class Anggota {
    private String nama, nomorKTP;
    private int limitPinjaman, jumlahPinjaman;
    
    Anggota(String nama, String nomorKTP, int limitPinjaman){
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama(){
        return nama;
    }
    public String getNoKTP(){
        return nomorKTP;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int nominal){
        if(nominal > limitPinjaman){
            System.out.println("Maaf sudah melebihi limit pinjaman!");
        }else{
            jumlahPinjaman = nominal;
        }
    }
    public void angsur(int nominal){
        if (nominal >= 0.1 * jumlahPinjaman && jumlahPinjaman != 0){
            jumlahPinjaman -= nominal;
        }else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman!");
        }
    }
}
