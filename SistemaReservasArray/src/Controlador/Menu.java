
package Controlador;
import Vista.VistaUsuario;
import java.util.Scanner;

        

public class Menu { 
    
   public void Iniciarmenu(){
       
       Scanner sc = new Scanner(System.in);
       VistaUsuario Empezar = new VistaUsuario();
        
        int opcion = 0;
        
        do{
        
        System.out.println("Benvenido al sistema de reservas");
        System.out.println("1. empezar");
        System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                
                Empezar.reservarAsiento();
                
                System.out.println("presione 1 si desea ver cuantas sillas reservo en total");
                System.out.println("de lo contrario presione cualquier tecla");
                int decision = sc.nextInt();
                
                if(decision == 1){
                    Empezar.imprimir();
                }
                
                
                break;
                
            case 2:
                System.out.println("saliendo del programa");
                break;
                
            default:
                System.out.println("opcion invalida");
                break;
        }
        }while(opcion != 2);
    }
    
}

