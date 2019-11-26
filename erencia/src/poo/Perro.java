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
public class Perro {
    public String nombrepe;
    public int edadpe;
    public double razape;
    public double pesope;
    public String sexope;
    
public Perro(String nombrepe, int edadpe, double razape, double pesope,
            String sexope){
        this.nombrepe =nombrepe;
        this.edadpe =edadpe;
        this.razape=razape;
        this.pesope=pesope;
        this.sexope=sexope;
    }
public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}
