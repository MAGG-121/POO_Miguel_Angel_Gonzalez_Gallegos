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
public class Carro {
    public String duenio;
    public String marca;
    public String modelo;
    public String estado;
    
        public Carro(String duenio, String marca, String modelo, String estado){
             this.duenio=duenio;
             this.marca=marca;
             this.modelo=modelo;
             this.estado=estado;
        }
public  void saludar(){
        System.out.println("Hola mundo");
    } 

    public String getDuenio(){

  return this.duenio;
}
    
    public void setDuenio(String duenio){

   this.duenio=duenio;

}

    public String getMarca(){

  return this.marca;
}
    
    public void setmarca(String marca){

   this.marca=marca;

}

    public String  getModelo(){

   return this.modelo;
}

    public void setModelo(String modelo){

   this.modelo=modelo;

}
   
    public String getestado(){

  return this.estado;
}
    
    public void setEstado(String estado){

   this.estado=estado;

}
    
}
