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
public class Alunmo_er extends Persona_er{
    private String carrera;
    private double semestre;
    private double codigo;
    private double clave;

    public Alunmo_er() {
        
        
    }

    public Alunmo_er(String nombre_er, int edad_er, double estatura_er, double peso_er,
            String sexo_er, String carrera, double semestre, double codigo, double clave) {
         super(nombre_er, carrera, carrera, clave, nombre_er, edad_er, estatura_er, peso_er, sexo_er);
        this.carrera = carrera;
        this.semestre = semestre;
        this.codigo = codigo;
        this.clave = clave;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getSemestre() {
        return semestre;
    }

     //public double getCodigo() {
       // return codigo;
    //}
    public double getClave() {
        return clave;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(double semestre) {
        this.semestre = semestre;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public void setClave(double clave) {
        this.clave = clave;
    }
    
    
    
    }

