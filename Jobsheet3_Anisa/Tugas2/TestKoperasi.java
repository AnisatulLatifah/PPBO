/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args){
        Anggota donny = new Anggota("Donny", "112233", 5000000);        
        
//        System.out.println("Nama Anggota  : " +donny.getNama());
//        System.out.println("Limit Pinjaman: " +donny.getLimitPinjaman());
//        
//        System.out.println("\n Meminjam uang 10.000.000...");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " +donny.getJumlahPinjaman());
//        
//        System.out.println("\n Meminjam uang 4.000.000...");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " +donny.getJumlahPinjaman());
//        
//        System.out.println("\n Membayar angsuran 1.000.000...");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " +donny.getJumlahPinjaman());
//        
//        System.out.println("\n Membayar angsuran 3.000.000...");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " +donny.getJumlahPinjaman());
        
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih = 0;
        int menu;
        do{
            System.out.println("Silahkan pilih menu: ");
            System.out.println("1. Tampilkan Data Anggota");
            System.out.println("2. Jumlah Pinjaman");
            System.out.println("3. Angsuran");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                    do {
                        System.out.println("Nama           : " +donny.getNama());
                        System.out.println("No. KTP        : " +donny.getNoKTP());
                        System.out.println("Limit Pinjaman : " +donny.getLimitPinjaman());
                        System.out.println("");
                    } while (pilih == 'Y' || pilih == 'y');
                }
                break;
                case 2 : {
                        System.out.print("Jumlah pinjaman Anda: ");
                        int pinjam = sc.nextInt();
                        donny.pinjam(pinjam);
                        System.out.print("Jumlah pinjaman Anda saat ini : "+ donny.getJumlahPinjaman());
                        System.out.println("");
                    }
                break;
                case 3 : {
                    System.out.print("Jumlah Angsuran : ");
                    int angsur = sc.nextInt();
                    donny.angsur(angsur);
                    System.out.println("Jumlah pinjaman Anda saat ini : " +donny.getJumlahPinjaman());
                    System.out.println("");
                }
                break;
                }
            } while (menu > 0 && menu <= 3);
        }
    }

