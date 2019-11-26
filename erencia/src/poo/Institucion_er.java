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
public class Institucion_er {
    private String nombre;
    private String codigo;
    private String localisacion;
    private double capacidad;

    public Institucion_er() {
    }

    public Institucion_er(String nombre, String codigo, String localisacion, double capacidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.localisacion = localisacion;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocalisacion() {
        return localisacion;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLocalisacion(String localisacion) {
        this.localisacion = localisacion;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }


}
