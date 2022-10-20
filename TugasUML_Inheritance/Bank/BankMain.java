/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
public class BankMain {
   public static void main(String[] args){
       
       Manager M = new Manager("Buri Reko,S.E.","213176","Jl.Bunga Kopi,Malang","Laki-laki", "M001", 8000000,1200000);
       M.tampilDataManager();
       
       Teller T = new Teller("Fitri Riana","213456","Jl.Kembang Turi,Malang","Perempuan","T001",4000000,500000,1000000,75000);
       T.tampilDataTeller();
       
       NasabahPrioritas NP = new NasabahPrioritas("Anisatul Latifah","218765","Magetan","Perempuan","8963797",1000000000,4500000,"P001","PRKemala");
       NP.tampilDataNsbPrio();
       
       NasabahUmum NU = new NasabahUmum("Muhammad Isro'i","216549","Tangerang","Laki-laki","5637654",4000000,50000,"NU001");
       NU.tampilDataNasabahUm();
       
   } 
}
