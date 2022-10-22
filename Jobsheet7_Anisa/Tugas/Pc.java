/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class Pc extends Komputer{
    public int ukuranMonitor;
    
    public Pc(){
    }
    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk,kecProsesor,sizeMemory,jnsProsesor);  
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilDataPc(){
        super.tampilData();
        System.out.println("Ukuran Monitor      : "+ukuranMonitor);
    }
}