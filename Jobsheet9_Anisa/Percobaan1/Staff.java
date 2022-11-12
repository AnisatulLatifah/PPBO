/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;
public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;
    
    public void setLembur(int lembur){
        this.lembur = lembur;
    }
    public int getLembur(){
        return lembur;
    }
     public void setGajiLembur(double gajiLembur){
        this.gajiLembur = gajiLembur;
    }
      public double getGajiLembur(){
        return gajiLembur;
    }
      
    //overloading
      public double getGaji(int lembur, double gajiLembur){
          return super.getGaji() + lembur * gajiLembur;
      }
      
      //overriding
      public double getGaji(){
          return super.getGaji() + lembur * gajiLembur;
      }
      
      public void lihatInfo(){
          System.out.println("NIP         : " +this.getNip());
          System.out.println("Nama        : " +this.getNama());
          System.out.println("Golongan    : " +this.getGolongan());
          System.out.println("Jml Lembur  : Rp. " +this.getGajiLembur());
          System.out.println("Gaji        : Rp. " +this.getGaji());
          System.out.println();

      }
}
