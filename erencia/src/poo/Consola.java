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
public class Consola {
    public String compañia;
    public String modelo;
    public String tipo;
    public double precio;
    
  public Consola(String compañia, String modelo, String tipo, double precio){
      this.compañia=compañia;
      this.modelo=modelo;
      this.tipo=tipo;
      this.precio=precio;
  }
 public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}
