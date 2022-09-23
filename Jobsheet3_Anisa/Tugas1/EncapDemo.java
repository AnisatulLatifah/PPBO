/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge >=18 && newAge <=30){
            age = newAge;
        }else if(newAge < 18){
            System.out.println("Umur kurang dari 18 tahun!");
        }else if(newAge >30){
            System.out.println("Umur lebih dari 30 tahun!");
        }  
      }
    }
