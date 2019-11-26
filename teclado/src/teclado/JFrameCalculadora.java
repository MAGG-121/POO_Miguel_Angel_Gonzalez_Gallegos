/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameCalculadora extends JFrame {
    JButtonC  btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    JButtonC  btnQ, btnW, btnE, btnR, btnT, btnY, btnU, btnI, btnO, btnP, BTNbA;
    JButtonC  btnA, btnS, btnD, btnF, btnG, btnH, btnJ, btnK, btnL, btn_N;
    JButtonC  btnZ, btnX, btnC, btnV, btnB, btnN, btnM, btnIzq, btnDer, btnArr, btnAba;
    JTextField display;
    ListenerVerdes nu;
    Operaciones_cal si;
    int num=100;
    int cont;
   
   
    public JFrameCalculadora() {
        inicializarComponentes();
        
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
       
        JPanel panelCentral = new JPanel(new GridLayout(4,10));
       
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        
         btn1 = new JButtonC("1", dim, Color.yellow);
         btn2 = new JButtonC("2", dim, Color.yellow);
         btn3 = new JButtonC("3", dim, Color.yellow);
         btn4 = new JButtonC("4", dim, Color.yellow);
         btn5 = new JButtonC("5", dim, Color.yellow);
         btn6 = new JButtonC("6", dim, Color.yellow);
         btn7 = new JButtonC("7", dim, Color.yellow);
         btn8 = new JButtonC("8", dim, Color.yellow);
         btn9 = new JButtonC("9", dim, Color.yellow);
         btn0 = new JButtonC("0", dim, Color.yellow);
         
         btnQ = new JButtonC("Q", dim, Color.GRAY);
         btnW = new JButtonC("W", dim, Color.GRAY);
         btnE = new JButtonC("E", dim, Color.GRAY);
         btnR = new JButtonC("R", dim, Color.GRAY);
         btnT = new JButtonC("T", dim, Color.GRAY);
         btnY = new JButtonC("Y", dim, Color.GRAY);
         btnU = new JButtonC("U", dim, Color.GRAY);
         btnI = new JButtonC("I", dim, Color.GRAY);
         btnO = new JButtonC("O", dim, Color.GRAY);
         btnP = new JButtonC("P", dim, Color.GRAY);
         
         btnA = new JButtonC("A", dim, Color.GRAY);
         btnS = new JButtonC("S", dim, Color.GRAY);
         btnD = new JButtonC("D", dim, Color.GRAY);
         btnF = new JButtonC("F", dim, Color.GRAY);
         btnG = new JButtonC("G", dim, Color.GRAY);
         btnH = new JButtonC("y", dim, Color.GRAY);
         btnJ = new JButtonC("J", dim, Color.GRAY);
         btnK = new JButtonC("K", dim, Color.GRAY);
         btnL = new JButtonC("L", dim, Color.GRAY);
         btn_N = new JButtonC("Ñ", dim, Color.GRAY);
         
         btnZ = new JButtonC("Z", dim, Color.GRAY);
         btnX = new JButtonC("X", dim, Color.GRAY);
         btnC = new JButtonC("C", dim, Color.GRAY);
         btnV = new JButtonC("V", dim, Color.GRAY);
         btnB = new JButtonC("B", dim, Color.GRAY);
         btnN = new JButtonC("N", dim, Color.GRAY);
         btnM = new JButtonC("M", dim, Color.GRAY);
         
         btnIzq = new JButtonC("<-", dim, Color.BLUE);
         btnDer = new JButtonC("->", dim, Color.BLUE);
         btnArr = new JButtonC(" ", dim, Color.BLUE);
         btnAba = new JButtonC(" ", dim, Color.BLUE);
         
         BTNbA = new JButtonC(" ", dim, Color.BLUE);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btn0);

        panelCentral.add(btnQ);
        panelCentral.add(btnW);
        panelCentral.add(btnE);
        panelCentral.add(btnR);
        panelCentral.add(btnT);
        panelCentral.add(btnY);
        panelCentral.add(btnU);
        panelCentral.add(btnI);
        panelCentral.add(btnO);
        panelCentral.add(btnP);

        panelCentral.add(btnA);
        panelCentral.add(btnS);
        panelCentral.add(btnD);
        panelCentral.add(btnF);
        panelCentral.add(btnG);
        panelCentral.add(btnH);
        panelCentral.add(btnJ);
        panelCentral.add(btnK);
        panelCentral.add(btnL);
        panelCentral.add(btn_N);

        panelCentral.add(btnZ);
        panelCentral.add(btnX);
        panelCentral.add(btnC);
        panelCentral.add(btnV);
        panelCentral.add(btnB);
        panelCentral.add(btnN);
        panelCentral.add(btnM);
        panelCentral.add(BTNbA);
        panelCentral.add(BTNbA);
        panelCentral.add(BTNbA);
        
        

        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        
        
        
//        display = new JTextField();
//        Font auxF = display.getFont();
//        Font nueva = new Font(auxF.getName(),auxF.getStyle(),50);
//        display.setFont(nueva);
//        display.setEditable(false);
//        display.setHorizontalAlignment(JTextField.RIGHT);
//        add(display,BorderLayout.NORTH);
        



         nu = new ListenerVerdes(this);
         nu.botin1();
      //nu.mostrar();
//         si = new Operaciones_cal(this);
//         si.Botin2();
         

         setLocationRelativeTo(null);
        setMinimumSize(new Dimension(1500,450));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public JButtonC getBtnC() {
        return btnC;
    }

    public JButtonC getBtn7() {
        return btn7;
    }

    public JButtonC getBtn8() {
        return btn8;
    }

    public JButtonC getBtn9() {
        return btn9;
    }

    public JButtonC getBtn4() {
        return btn4;
    }

    public JButtonC getBtn5() {
        return btn5;
    }

    public JButtonC getBtn6() {
        return btn6;
    }

    public JButtonC getBtn2() {
        return btn2;
    }

    public JButtonC getBtn3() {
        return btn3;
    }

    public void setBtnC(JButtonC btnC) {
        this.btnC = btnC;
    }

    
    public void setBtn7(JButtonC btn7) {
        this.btn7 = btn7;
    }

    public void setBtn8(JButtonC btn8) {
        this.btn8 = btn8;
    }

    public void setBtn9(JButtonC btn9) {
        this.btn9 = btn9;
    }

    
    public void setBtn4(JButtonC btn4) {
        this.btn4 = btn4;
    }

    public void setBtn5(JButtonC btn5) {
        this.btn5 = btn5;
    }

    public void setBtn6(JButtonC btn6) {
        this.btn6 = btn6;
    }

   
    public void setBtn1(JButtonC btn1) {
        this.btn1 = btn1;
    }

    public void setBtn2(JButtonC btn2) {
        this.btn2 = btn2;
    }

    public void setBtn3(JButtonC btn3) {
        this.btn3 = btn3;
    }


    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }

    
    
}
