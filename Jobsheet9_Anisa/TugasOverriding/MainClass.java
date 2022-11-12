/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasOverriding;
public class MainClass {
   public static void main(String[] args){
       
       System.out.println("==Dynamic Method Dispatch==");
       Manusia m1 = new Manusia();
       Manusia m2 = new Dosen();
       Manusia m3 = new Mahasiswa();
       m1.makan();
       m2.makan();
       m3.makan();
       //Error karena di superclass tidak ada method yang sama dengan kelas subclass   
//       m2.lembur();
//       m3.tidur();
       System.out.println();
       System.out.println("==Mahasiswa Only==");
       Mahasiswa m = new Mahasiswa();
       m.bernafas();
       m.makan();
       m.tidur();
       
       System.out.println();
       System.out.println("==Dosen Only==");
       Dosen d = new Dosen();
       d.bernafas();
       d.makan();
       d.lembur();

   } 
}
