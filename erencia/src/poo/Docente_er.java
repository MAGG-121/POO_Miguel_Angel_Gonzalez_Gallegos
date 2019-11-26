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
public class Docente_er extends Persona{
    private String area;
    private String carrera;
    private String materia;
    private double entrada;
    private double salida;

    public Docente_er() {
        super(null, 0, 0, 0, null);
    }

    

    public Docente_er(String nombre_er, int edad_er, double estatura_er, double peso_er,
            String sexo_er, String area, String carrera, String materia, double entrada, double salida) {
        super(nombre_er, edad_er, estatura_er, peso_er, sexo_er);
        this.area = area;
        this.carrera = carrera;
        this.materia = materia;
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getArea() {
        return area;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getMateria() {
        return materia;
    }

    public double getEntrada() {
        return entrada;
    }

    public double getSalida() {
        return salida;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public void setSalida(double salida) {
        this.salida = salida;
    }
    
    
    
    
    
}
