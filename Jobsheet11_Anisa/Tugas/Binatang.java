/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    public Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setJmlKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    public int getJmlKaki(){
        return jmlKaki;
    }
    public abstract void displayBinatang();
}