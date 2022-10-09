/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anisa.relasiclass.percobaan4;
public class MainPercobaan4 {
    public static void main(String[] args){
//       Penumpang p = new Penumpang("12345", "Mr. Krab");
       Penumpang budi = new Penumpang ("12345", "Budi");
       Gerbong gerbong = new Gerbong("A", 10);
       gerbong.setPenumpang(budi, 1);
       gerbong.setPenumpang(budi, 1);
//       gerbong.setPenumpang(p, 1);
//       gerbong.setPenumpang(p, 1);
       System.out.println(gerbong.info());

    }
}
