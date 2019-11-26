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
public class Embleado {
    public String nombre;
    public int edad;
    public double puesto;
    public double salario;
    public String sexo;
    
    public Embleado(String nombre, int edad, double puesto, double salario,
                   String sexo){
                this.nombre =nombre;
                this.edad =edad;
                this.puesto=puesto;
                this.salario=salario;
                this.sexo=sexo;
    }
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
}
