
package Vista;
import java.util.Scanner;
import Modelo.Juego;


public class IniciarJuego {
    Scanner sc = new Scanner(System.in);
    
    public void empezar(){
        
        // en el controlador se debe dar la bienvenida
        
        System.out.println("Ingrese los dos numeros en el que el juego se ejecutara");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        Juego rango = new Juego(num1, num2);
        
        // aca se inicia el juego desde el modelo clase
        
        
        
        System.out.println("GO!");
        rango.jugar();
        rango.almacenar();
        
        int reset = 0;
        
        do{
        
        System.out.println("Quiere jugar de nuevo?");
        System.out.println("1. si");
        System.out.println("2. no");
        reset = sc.nextInt();
        
        if(reset == 1){
            System.out.println("Ingrese los dos numeros en el que el juego se ejecutara");
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            
            Juego rango2 = new Juego(num3, num4);
            
            System.out.println("GO!");
            rango2.jugar();
            rango2.almacenar();
            
       }
        
        }while(reset != 2);
    }
    
    //vamos a imprimir los reusltados que dara el juego por si el usuario desea visualizarlos todos
    
    
}
