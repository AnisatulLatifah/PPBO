/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public void heal(){
    }
    
    @Override
    public void destroyed(){

    }
    public String getZombieInfo(){
        String info ="";
        info += "Health\t= "+health+"\nLevel\t= "+level+"\n";
        return info;
    }
}
