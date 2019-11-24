/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaimajenes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alumno
 */
public class JFrameImagen extends JFrame{
  
    public JFrameImagen(Image imagen){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setResizable(false);
    JLabel etiqueta = new JLabel();
    etiqueta.setIcon(new ImageIcon(imagen));
    add(etiqueta);
    setVisible(true);
            }

    JFrameImagen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
