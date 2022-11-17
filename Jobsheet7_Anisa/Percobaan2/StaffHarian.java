/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;
public class StaffHarian extends Staff{
    public int jmlJamKerja;
    
    public StaffHarian(String nama, String alamat, String jk, int umur,
    int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
}
    public void tampilStaffHarian(){
        System.out.println("===================Data STaff Harian==================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja= "+jmlJamKerja);
        System.out.println("Gaji Bersih     = "+(gaji*jmlJamKerja+lembur-potongan));
    }
}