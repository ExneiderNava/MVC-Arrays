
package Controlador;
import java.util.Scanner;
import Vista.IniciarJuego;
import Modelo.Juego;

public class Menu {
    Scanner sc = new Scanner(System.in);
    
    public void inciarJuego(){
        
        int decision = 0;
        
        do{
        
        System.out.println("FIZZ BUZZ");
        System.out.println("1. PLAY");
        System.out.println("2. EXIT");
        decision = sc.nextInt();
        
        if(decision == 1){
            IniciarJuego jugar = new IniciarJuego();
            
            jugar.empezar();
        }
        
        }while(decision != 2);
        
        System.out.println("Quieres ver tus partidas de nuevo?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int mostrar = sc.nextInt();
        
        if(mostrar == 1){
            Juego Mostrar = new Juego();
            
            Mostrar.mostrarresultados();
        }
        
        
    }
    
    
}
