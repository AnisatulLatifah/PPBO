/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class KomputerMain {
    public static void main(String[] args){
        
        Pc pc = new Pc("Asus",180,8,"Intel",19);
        System.out.println("===============Tampil Data Pc================");
        pc.tampilDataPc();
        
        Mac mac = new Mac("McBook",250,32,"Apple","Lithium ion","Secure Enclave");
        System.out.println("===============Tampil Data Mac===============");
        mac.tampilMac();
        
        Windows wd = new Windows("Acer",120,16,"Intel","Nickel Cadmium","Dark Mode");
        System.out.println("==============Tampil Data Windows============");
        wd.tampilWindows();
    }
}
