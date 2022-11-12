/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasOverloading;
public class MainClass {
    public static void main(String[] args){
        
        Segitiga s = new Segitiga();
        System.out.println("Sudut Segitiga      : "+s.TotalSudut(80));
        System.out.println("Sudut Segitiga      : "+s.TotalSudut(80, 45));
        System.out.println("Keliling Segitiga   : "+s.keliling(3, 4));
        System.out.println("Keliling Segitiga   : "+s.keliling(3, 4, 5));
    }
}
