/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenerVerdes {

   private JFrameCalculadora a;
   public String cantidad;
   public int contador=0;  
   public String seve[];
   public String c1[];
   public String c2[];
   public String cadenaNumeros="";
   public String operacion="nula";
   public double  resultado, num1, num2;
   public int opee;
   
   
   public ListenerVerdes(JFrameCalculadora a){
      this.a=a;
       seve = new String[100];
       c1 = new String[100];
       c2 = new String[100];
       opee=0;
   }
   public void botin1(){
                                                                              /////inicio numeros
      
      
      
      a.getBtn2().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("2");
          cantidad="2";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="2";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn3().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("3");
          cantidad="3";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="3";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn4().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("4");
          cantidad="4";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="4";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn5().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("5");
          cantidad="5";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="5";
          a.display.setText(cadenaNumeros);
          
      });
      
      a.getBtn6().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("6");
          cantidad="6";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="6";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn7().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("7");
          cantidad="7";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="7";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn8().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("8");
          cantidad="8";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="8";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn9().addActionListener((ActionEvent M)->{
          a.getDisplay().setText("9");
          cantidad="9";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="9";
          a.display.setText(cadenaNumeros);
      });
      
     }
}
