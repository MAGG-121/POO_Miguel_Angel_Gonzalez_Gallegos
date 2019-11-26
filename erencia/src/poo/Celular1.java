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
public class Celular1 {
    public String marca1;
    public double almacenamiento1;
    public double prosesamiento1;
    public String estado1;
    
    public Celular1(String marca1, double almacenamiento1, double prosesamiento1,
                    String estado1){
        this.marca1=marca1;
        this.almacenamiento1=almacenamiento1;
        this.prosesamiento1=prosesamiento1;
        this.estado1=estado1;
    }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
public String getMarca1(){

  return this.marca1;
}

public void setMarca1(String marca1){

   this.marca1=marca1;

}

public double getAlmacenamiento1(){

  return this.almacenamiento1;
}

public void setAlmacenamiento1(double almacenamiento1){

   this.almacenamiento1=almacenamiento1;

}

public double getProsesamiento1(){

  return this.prosesamiento1;
}

public void setProsesamiento1(double prosesamiento1){

   this.prosesamiento1=prosesamiento1;

}

public String getEstado1(){

  return this.estado1;
}


public void setEstado1(String estado1){

   this.estado1=estado1;

} 
    
}
