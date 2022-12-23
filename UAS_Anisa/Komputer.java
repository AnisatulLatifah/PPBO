/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_Anisa;
public abstract class Komputer implements Mouse, Keyboard, Printer{
    public String merk, processor, warna;
    protected boolean status;
    
    abstract void hidupkan_os();
    abstract void matikan_os();
}
