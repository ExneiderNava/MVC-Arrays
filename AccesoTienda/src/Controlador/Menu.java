
package Controlador;
import java.util.Scanner;
import Vista.IngresarCliente;


public class Menu {
    Scanner sc = new Scanner(System.in);
    IngresarCliente iniciar = new IngresarCliente();
    
    public void empezar(){
        System.out.println("-CONTROL DE ACCESO A TIENDA");
        System.out.println("1. EMPEZAR");
        System.out.println("2. SALIR");
        int decision = sc.nextInt();
        
        if(decision == 1){
            iniciar.verificar();
            iniciar.getArrays();
        }
    }
    
}
