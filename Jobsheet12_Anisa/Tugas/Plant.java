/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
public class Plant {
    
    public void doDestroy(Destroyable d){
        if (d instanceof WalkingZombie){
            WalkingZombie walkZombie = (WalkingZombie) d;
            walkZombie.destroyed();
        }else if (d instanceof JumpingZombie){
            JumpingZombie jumpZombie = (JumpingZombie) d;
            jumpZombie.destroyed();
        }else if (d instanceof Barrier){
            Barrier barrier = (Barrier) d;
            barrier.destroyed();
        }
    }
}
