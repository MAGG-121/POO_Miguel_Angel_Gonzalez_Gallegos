/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaimajenes;

import java.awt.Image;

/**
 *
 * @author Alumno
 */
public class MainImagenes {
    public static void main(String[] args) {
        Gestor gestor= new Gestor();
        Image io =gestor.abrirImagen();
        JFrameImagen frame =new JFrameImagen();
        
    }
}
