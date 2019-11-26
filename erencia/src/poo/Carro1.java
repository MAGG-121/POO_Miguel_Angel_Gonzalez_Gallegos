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
public class Carro1 {
    public String duenio1;
    public String marca1;
    public String modelo1;
    public String estado1;
    
    public Carro1(String duenio1, String marca1, String modelo1, String estado1){
        this.duenio1=duenio1;
        this.marca1=marca1;
        this.modelo1=modelo1;
        this.estado1=estado1;
    }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getDuenio1(){

  return this.duenio1;
}
    
    public void setDuenio1(String duenio1){

   this.duenio1=duenio1;

}

    public String getMarca1(){

  return this.marca1;
}
    
    public void setmarca1(String marca1){

   this.marca1=marca1;

}

    public String  getModelo1(){

   return this.modelo1;
}

    public void setModelo1(String modelo1){

   this.modelo1=modelo1;

}
   
    public String getestado1(){

  return this.estado1;
}
    
    public void setEstado1(String estado1){

   this.estado1=estado1;

}

  
}
