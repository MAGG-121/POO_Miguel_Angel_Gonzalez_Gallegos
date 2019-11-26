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
public class Casa1 {
    public double tamanio1;
    public String direccion1;
    public double precio1;

   public Casa1 (double tamanio1, String direccion1, double precio1){
    this.tamanio1=tamanio1;
    this.direccion1=direccion1;
    this.precio1=precio1;
    
   } 
   public  void saludar(){
        System.out.println("Hola mundo");
    } 

public double getTamanio1(){

  return this.tamanio1;
}

public void setTamanio1(double tamanio1){

   this.tamanio1=tamanio1;

}

public String getDireccion1(){

  return this.direccion1;
}

public void setDireccion1(String direccion1){

   this.direccion1=direccion1;

}

public double getPrecio1(){

  return this.precio1;
}

public void setPrecio1(double precio1){

   this.precio1=precio1;

}
}
