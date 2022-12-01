/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnisatulLatifah;
    public class Oviraptor extends Dinosaurus implements IBertelur{

    public void makan(){
    System.out.println("Oviraptor makan telur");
    }
    public void berjalan(){
        System.out.println("Oviraptor berjalan dengan kaki");
    }   
    @Override
    public void bertelur() {
        System.out.println("Oviraptor Bertelur sebanyak 10 butir");
    }
}
