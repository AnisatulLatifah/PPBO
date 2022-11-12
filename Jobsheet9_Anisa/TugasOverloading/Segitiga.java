/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasOverloading;
public class Segitiga {
    private int sudut, keliling;
    
    public int TotalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int TotalSudut(int sudutA,int sudutB){
        return sudut = 180 - (sudutA+sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA+sisiB+sisiC;
    }
    public int keliling(int sisiA, int sisiB){
        double sisiC;
        sisiC = Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB,2));
        return keliling = (int) (sisiA+sisiB+sisiC);
    }
}
