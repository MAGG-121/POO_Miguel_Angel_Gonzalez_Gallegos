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
public class Alumno {
    private String nombre;
    private int edad;
    private double semestre;
    private double codigo;
    private String sexo;
    
    public Alumno(String nombre, int edad, double semestre, double codigo,
            String sexo){
        this.nombre =nombre;
        this.edad =edad;
        this. semestre=semestre;
        this.codigo=codigo;
        this.sexo=sexo;
    }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getNombre(){

  return this.nombre;
}
    
    public void setNombre(String nombre){

   this.nombre=nombre;

}

    public int getEdad(){

  return this.edad;
}
    
    public void setEdad(int edad){

   this.edad=edad;

}

    public double getsemestre(){

  return this.semestre;
}

    public void setSemestre(double semestre){

   this.semestre=semestre;

}
   
    public double getCodigo(){

  return this.codigo;
}
    
    public void setCodigo(double codigo){

   this.codigo=codigo;

}
    
    public String getSexo(){

  return this.sexo;
}

    public void setSexo(String sexo){

   this.sexo=sexo;

}


}
