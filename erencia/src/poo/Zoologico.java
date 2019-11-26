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
public class Zoologico {
    public String nombre;
    public int cant_animales;
    public double entradas;
    public double popularidad;
    public String especie;
    
    public Zoologico(String nombre,String especie, double entradas, int cant_animales,
        double popularidad){
        this.nombre=nombre;
        this.especie=especie;
        this.entradas=entradas;
        this.cant_animales =cant_animales;
        this.popularidad=popularidad;
        
    }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
}
