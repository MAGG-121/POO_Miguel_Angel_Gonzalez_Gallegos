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
public class Computadora {
   
    public String marca;
    public String modelo;
    public double prosesamiento;
    public double ram;
    
    
  public Computadora(String marca, String modelo,
          double prosesamiento, double ram ){
    this.marca=marca;
    this.modelo=modelo;
    this.prosesamiento=prosesamiento;
    this.ram=ram;
}
public  void saludar(){
        System.out.println("Hola mundo");
    } 
}
