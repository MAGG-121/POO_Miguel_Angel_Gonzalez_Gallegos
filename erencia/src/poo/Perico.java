/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Hp
 */
public class Perico {
    public String nombre;
    public double edad;
    public String raza;
    
    public Perico(String nombre, double edad, String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
    }
    
   public  void saludar(){
        System.out.println("Hola mundo");
    } 
  
    
}
