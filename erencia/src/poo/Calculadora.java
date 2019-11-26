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
public class Calculadora {
 private double n1;
 private double n2;
 private double res;

 public double sumar(double n1,double n2){
     double a;
     a=n1+n2;
     return a;
 }
 public double restar(double n1,double n2){
      
     double a;
     a=n1*n2;
     return a;
 }
 public double multiplicar(double n1,double n2){
     double a;
     a=n1*n2;
     return a;
 } 
 public double dividir (double n1,double n2){
     double a;
     a=n1/n2;
     return a;
 }
    public Calculadora(double n1, double n2, double res) {
        this.n1 = n1;
        this.n2 = n2;
        this.res = res;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getRes() {
        return res;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setRes(double res) {
        this.res = res;
    }
    
    
    
}
