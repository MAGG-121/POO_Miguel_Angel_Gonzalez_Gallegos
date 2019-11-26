/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.io.*;

/**
 *
 * @author MiPC
 */

public class JuegoGato{
  //Variables.  
    public char [] [] tablero;
    public char jugadorUno;
    public char jugadorDos;
    public boolean turno;
    int contador;        

 //constructor, inicialisa las variables
    public JuegoGato(){
       
        tablero      = new char[3][3];               
        jugadorUno   = 'X';
        jugadorDos   = 'O';
        turno        = true;  //si es true es jugador 1 si no el dos
        int contador = 0;     //cuanta los turnos que an transcurrido
        inicializarTablero();  
    }
       
  //crea el arreglo con elnum. de cada casilla.
    public void inicializarTablero(){
       
        int posicion = 1;
       
        for(int i=0;i<3;i++){
               
                for(int j=0; j<3;j++){
                       
                        tablero[i][j] = Integer.toString(posicion).charAt(0);
                        posicion++;
                }                      
        }
    }
   
  //crea el tablero
    public void imprimirTablero(){
               
        for(int i=0;i<3;i++){
               
                for(int j=0;j<3;j++){
                       
                        if(j<2)
                       
                                System.out.print(" " + tablero[i][j] + " |");
                       
                        else
                               
                                System.out.print(" " + tablero[i][j] + " ");
                                                               
                }
               
                if(i<2)
                       
                        System.out.println("\n-----------");                                                                   
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
   
  //coloca el valor donde se coloco  
    public void indicarPosicionArreglo (int a, int b, char c) {tablero [a][b]=c;}
  //cambia el valor del turno  
    public void setTurno(boolean d){
        turno=d;}
  //modifica el contador.  
    public void setContador(int e){
        contador=e;}
   
  //regresa los valores de las posiciones.  
    public char getPosicionArreglo (int a, int b){
        return tablero[a][b];}
       
  //coloca ficha jugador 1.
    public char getJugadorUno(){
        return jugadorUno;}            
   
  //coloca ficha jugador 1.
    public char getJugadorDos(){
        return jugadorDos;}            
 
  //devuelve el valor de turno
    public boolean getTurno(){
        return turno;}
  //devuelve el valor del contador             
    public int getContador(){
        return contador;}          
   
   
  //Imuestra de quien es el trno
    public void indicarTurno(){
       
        if(getTurno()==true){
               
                System.out.println("JUGADOR 1: cual es su eleccion? .");
        }
               
        else{
               
                System.out.println("JUGADOR 2: cual es su eleccion?."); 
        }     
    }
   
  
    public char obtenerFigura(){
       
        if(getTurno()==true){
                return jugadorUno;
        }
        else{
                return jugadorDos;
        }
    }
   
  
    public void cambiarTurno(){        
       
        if(obtenerFigura()=='X') //Si el metodo regresa un valor char igual a "X" cambia el valor de "turno" a "false".
               
                setTurno(false);
       
        else
               
                setTurno(true);
    }
     
  
    public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){
     
      
        if(espacio!=getJugadorUno()&&espacio!=getJugadorDos()){
               
           indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());//verifica las condivciones
           cambiarTurno();                                                  //cambia el turno de jugaror
           contador++;                                                      //incrementa al cumplirse lo anterior             
        }
       
        else
         
                                      
           System.out.println("la casilla ya fue escojida, escoja otra"); //se muestra cuando esta ocupada la casilla               
    }
           
  //Metodo Que Hace Uso De Un "switch" Para Indicar La Posicion Del Arreglo Que El Jugador Elijio En El Juego.  
    public void elegirPosicion(int posicion){
                           
            switch(posicion){
               
                        case 1:comprobarEspacio(getPosicionArreglo(0,0),0,0);break;
                        case 2:comprobarEspacio(getPosicionArreglo(0,1),0,1);break;
                        case 3:comprobarEspacio(getPosicionArreglo(0,2),0,2);break;
                        case 4:comprobarEspacio(getPosicionArreglo(1,0),1,0);break;
                        case 5:comprobarEspacio(getPosicionArreglo(1,1),1,1);break;
                        case 6:comprobarEspacio(getPosicionArreglo(1,2),1,2);break;
                        case 7:comprobarEspacio(getPosicionArreglo(2,0),2,0);break;
                        case 8:comprobarEspacio(getPosicionArreglo(2,1),2,1);break;
                        case 9:comprobarEspacio(getPosicionArreglo(2,2),2,2);break;
                        default:
                                System.out.println("solo agregar un dijito del 1-9");break;                             
            }          
    }
   
    public void decirGanador(char a){
       
       
        if(a=='X')
                               
                System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 1!, HA GANADO!.");
       
               
        else if(a=='O')
                           
                    System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 2!, HA GANADO!.");                      
               
                               
    }
   
    public void buscarGanador(){
                 
        for(int i=0;i<3;i++){
               
                for(int j=1;j<2;j++){
                       
                        if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){
                                                       
                           decirGanador(tablero[i][j]);
                           imprimirTablero();
                           setContador(10);
                        }                              
                }                      
        }
   
        for(int i=0;i<3;i++){
               
                for(int j=1;j<2;j++){
                       
                        if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
                       
                           decirGanador(tablero[j][i]);
                           imprimirTablero();
                           setContador(10);
                        }                              
                }
        }
       
        if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
       
           decirGanador(tablero[1][1]);
           imprimirTablero();
           setContador(10);
        }  
           
      
        if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
               
           decirGanador(tablero[1][1]);
           imprimirTablero();                  
           setContador(10);
        }      
    }    
       
  
    public void jugarGato(){
       
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("BIENVENIDO A GATO Ver. 1.0");      
               
        do{
       
                indicarTurno();                
                imprimirTablero();     
                try{elegirPosicion(Integer.parseInt(entrada.readLine()));}
                catch(IOException e){}    
                catch(NumberFormatException e){
                       
                        if(getTurno()==true)
                           
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 1.");
                       
                        else
                               
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 2.");      
                }
                         
                buscarGanador();
       
        }while(getContador()<9);
       
          if(getContador()==9){
               
                System.out.println("¡GATO!¡JUEGO EMPATADO!");                                        
            imprimirTablero();
            System.out.println("THANKS FOR PLAYING!");             
          }
         
         System.out.println("THANKS FOR PLAYING!");            
    }
   
    public static void main(String [] args){
       
        JuegoGato Objeto = new JuegoGato();
       
        Objeto.jugarGato();    
                                                                                       
    }    
}