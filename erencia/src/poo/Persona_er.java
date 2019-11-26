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
public class Persona_er extends Institucion_er{
    public String nombre_er;
    public int edad_er;
    public double estatura_er;
    public double peso_er;
    public String sexo_er;

    public Persona_er() {
    }

    public Persona_er(String nombre, String codigo, String localisacion, double capacidad ,String nombre_er, int edad_er, double estatura_er, double peso_er, String sexo_er) {
        super(nombre, codigo, localisacion, capacidad);
        this.nombre_er = nombre_er;
        this.edad_er = edad_er;
        this.estatura_er = estatura_er;
        this.peso_er = peso_er;
        this.sexo_er = sexo_er;
    }

    public String getNombre_er() {
        return nombre_er;
    }

    public int getEdad_er() {
        return edad_er;
    }

    public double getEstatura_er() {
        return estatura_er;
    }

    public double getPeso_er() {
        return peso_er;
    }

    public String getSexo_er() {
        return sexo_er;
    }

    public void setNombre_er(String nombre_er) {
        this.nombre_er = nombre_er;
    }

    public void setEdad_er(int edad_er) {
        this.edad_er = edad_er;
    }

    public void setEstatura_er(double estatura_er) {
        this.estatura_er = estatura_er;
    }

    public void setPeso_er(double peso_er) {
        this.peso_er = peso_er;
    }

    public void setSexo_er(String sexo_er) {
        this.sexo_er = sexo_er;
    }
    
   
}
