/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3Lingkaran;
public class Lingkaran {
    private double phi;
    private double radius;
    
    public void getPhi(double angka){
        phi = angka;
    }
    public void getRadius(double angka){
        radius = angka;
    }
    public double getLuas(){
        double luas = phi * radius * radius;
        return luas;
    }
    public double getKeliling(){
        double keliling = 2 * radius * phi;
        return keliling;
    }
    public void tampilDataLingkaran(){
        System.out.println("Phi       : "+phi);
        System.out.println("Radius    : "+radius);
    }
}
