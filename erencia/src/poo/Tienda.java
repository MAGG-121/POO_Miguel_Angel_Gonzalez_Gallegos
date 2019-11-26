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
public class Tienda {
    public String nombre;
    public String producto;
    public int cantidad;
    public double precio;
    
    
   public Tienda(String nombre, String producto, int cantidad, double precio){
        this.nombre=nombre;
        this.producto=producto;
        this.cantidad=cantidad;
        this.precio=precio;
        
   }
   public  void saludar(){
        System.out.println("Hola mundo");
    } 
}
