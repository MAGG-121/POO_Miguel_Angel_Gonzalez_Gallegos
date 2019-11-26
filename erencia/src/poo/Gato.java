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
public class Gato {
    public String nombrega;
    public int edadga;
    public double razags;
    public double pesoga;
    public String sexoga;
    
public Gato(String nombrega, int edadga, double razags, double pesoga,
            String sexoga){
        this.nombrega =nombrega;
        this.edadga =edadga;
        this.razags=razags;
        this.pesoga=pesoga;
        this.sexoga=sexoga;
    }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
}
