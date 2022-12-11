/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
    @Override
    public void destroyed() {
        strength -=9;
    }
    public String getBarrierInfo(){
        String data ="";
        data += "Barrier Strength = "+strength;
        return data;
    }
}

