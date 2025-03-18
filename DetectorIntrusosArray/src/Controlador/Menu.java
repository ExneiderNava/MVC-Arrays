
package Controlador;
import java.util.Scanner;
import Vista.ManipularSensores;
import Modelo.Sensores;


public class Menu {
    Scanner sc = new Scanner(System.in);
    Sensores alarmas = new Sensores();
    
    public void Empezar(){
        
        int inicio = 0;
        
        do{
        
        System.out.println("-SENSORES DE MOVIMIENTOS-");
        System.out.println("----DETECTAR INTRUSOS----");
        System.out.println("1. Empezar");
        System.out.println("2. Salir");
        inicio = sc.nextInt();
        
        if(inicio == 1){
            ManipularSensores iniciar = new ManipularSensores();
            iniciar.manipular();
                   
        }
        
        }while(inicio != 2);
        
        alarmas.getAlarmas();
        
    }
    
    
    
}
