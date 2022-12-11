/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class JumpingZombie extends Zombie {
    
        public JumpingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
        
    public void heal(){
        if (level == 1){
            super.health += (int) (0.3 * super.health);
        }else if (level == 2){
            super.health += (int) (0.4 * super.health);
        }else if (level == 3){
            super.health += (int) (0.5 * super.health);
        }
    }
    
    public void destroyed(){
        super.health -= (int) (0.1 * super.health);
    }
    
    public String getZombieInfo(){
        String data ="Jumping Zombie Data = \n";
        data += super.getZombieInfo();
        return data;
    }
}
