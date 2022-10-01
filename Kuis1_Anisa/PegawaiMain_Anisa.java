
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class PegawaiMain_Anisa {
    public static void main (String args[]){
        Pegawai_Anisa pgw = new Pegawai_Anisa();
        
        Scanner sc = new Scanner(System.in);
        char pilih = 0;
        int menu;
        do{
            System.out.println("Silahkan pilih menu: ");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Print Data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan : ");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                        System.out.print("NIP              : ");
                        sc.nextLine();
                        String nip = sc.nextLine();
                        System.out.print("Nama             : ");
                        String nama = sc.nextLine();
                        System.out.print("Jumlah Jam Kerja : ");
                        int jumlahJam = sc.nextInt();
                        System.out.println("");
                        pgw.setNIP(nip);
                        pgw.setNama(nama);
                        pgw.jumlahJamKerja(jumlahJam);
                }
                break;
                case 2 : {
                    pgw.setGajiPokok();
                    pgw.setLembur();
                    pgw.setUangMakan();
                    pgw.setTransport();
                    pgw.hitungGajiHarian();
                    pgw.cetakPenghasilan();
                }
                break;
            }
        } while (menu > 0 && menu <= 2);
    }
}


