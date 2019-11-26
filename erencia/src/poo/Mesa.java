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
public class Mesa {
    public String provedor;
    public double tamaño;
    public int cantida;
    public double precio;
    
  public Mesa(String provedor,double tamaño,int cantida, double precio){
      this.provedor= provedor;
      this.tamaño=tamaño;
      this.cantida=cantida;
      this.precio=precio;
  }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
}
