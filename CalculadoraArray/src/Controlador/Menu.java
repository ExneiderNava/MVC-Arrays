
package Controlador;
import java.util.Scanner;
import Vista.CalcularUsuario;


public class Menu {
    Scanner sc = new Scanner(System.in);
    
    public void empezar(){
        
        System.out.println("-CALCULADORA-");
        System.out.println("1. Iniciar");
        System.out.println("2. Salir");
        int decision = sc.nextInt();
        
        if(decision == 1){
            CalcularUsuario iniciar = new CalcularUsuario();
            
            iniciar.ingresar();
        }
        
    }
}
