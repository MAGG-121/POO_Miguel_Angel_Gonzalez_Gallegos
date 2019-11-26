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
public class Casa {
    public double tamaño;
    public String direccion;
    public double precio;

        public Casa (double tamaño, String direccion, double precio){
              this.tamaño=tamaño;
              this.direccion=direccion;
              this.precio=precio;

        } 

        public  void saludar(){
        System.out.println("Hola mundo");
    } 
        
public double getTamaño(){

  return this.tamaño;
}

public void setTamaño(double tamaño){

   this.tamaño=tamaño;

}

public String getDireccion(){

  return this.direccion;
}

public void set(String direccion){

   this.direccion=direccion;

}

public double getPrecio(){

  return this.precio;
}

public void setPrecio(double precio){

   this.precio=precio;

}

}
