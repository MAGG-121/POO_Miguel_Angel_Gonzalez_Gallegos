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
public class Celular {
    public String marca;
    public double almacenamiento;
    public double prosesamiento;
    public String estado;
    
    public Celular(String marca, double almacenamiento, double prosesamiento,
                    String estado){
        this.marca=marca;
        this.almacenamiento=almacenamiento;
        this.prosesamiento=prosesamiento;
        this.estado=estado;
        
        
    }
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 

public String getMarca(){

  return this.marca;
}

public void setMarca(String marca){

   this.marca=marca;

}

public double getAlmacenamiento(){

  return this.almacenamiento;
}

public void setAlmacenamiento(double almacenamiento){

   this.almacenamiento=almacenamiento;

}

public double getProsesamiento(){

  return this.prosesamiento;
}

public void setProsesamiento(double prosesamiento){

   this.prosesamiento=prosesamiento;

}

public String getEstado(){

  return this.estado;
}


public void setEstado(String estado){

   this.estado=estado;

}  
    
}
