/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
/**
 *
 * @author MI PC
 */
public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String  mostrarDatos(){
    
    return "persona  "+this.nombre+" "+this.apellido+" Y su edad es "+this.edad ;
    
    }
    
    public static void main(String[] args){
    
    Persona listaPersonas[] = new Persona[3];
    
    listaPersonas[0] = new Persona("pepe", "pepon", 12);
    listaPersonas[1] = new Persona("merco", "polo", 15);
    listaPersonas[2] = new Persona("ancho", "tero", 13);
    
    for(Persona e: listaPersonas){
    
    
    System.out.println(e.mostrarDatos());
    
    }
    
    
    
    
    }
    
    
}
