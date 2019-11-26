/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno
 */
public class Videojuegos {
     private String nombre;
     private String jenero;
     private String consola; 

    public Videojuegos(String nombre, String jenero, String consola) {
        this.nombre = nombre;
        this.jenero = jenero;
        this.consola = consola;
    }
     public Videojuegos() {
        this.nombre = "";
        this.jenero = "";
        this.consola = "";
    }
     
     

    public String getNombre() {
        return nombre;
    }

    public String getJenero() {
        return jenero;
    }

    public String getConsola() {
        return consola;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJenero(String jenero) {
        this.jenero = jenero;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

     
     
     
     
     
}

