
package Controlador;
import java.util.Scanner;
import Vista.ControlUsuario;


public class Menu {
    Scanner sc = new Scanner(System.in);
    ControlUsuario controlar = new ControlUsuario();
    
    public void opciones(){
        
        System.out.println("-AIRE ACONDICIONADO-");
        System.out.println("1. CONTROLAR");
        System.out.println("2. SALIR");
        int control = sc.nextInt();
        
        if(control == 1){
            controlar.controlAire();
        }
        
        controlar.getArray();
    }
    
}
