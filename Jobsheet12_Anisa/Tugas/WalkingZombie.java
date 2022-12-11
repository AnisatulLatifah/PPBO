/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
    super.health = health;
    super.level = level;
    }
        
    public void heal(){
        if (level == 1){
            super.health += (int) (0.1 * super.health);
        }else if (level == 2){
            super.health += (int) (0.3 * super.health);
        }else if (level == 3){
        super.health += (int) (0.4 * super.health);
        }
    }
    
    public void destroyed(){
        super.health -= (int) (0.2 * super.health);
    }
    
    public String getZombieInfo(){
        String data ="Walking Zombie Data = \n";
        data += super.getZombieInfo();
        return data;
    }
}
