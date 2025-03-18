
package Controlador;
import java.util.Scanner;
import Vista.Sisteluces;
import Modelo.Luces;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Sisteluces empezar = new Sisteluces();
    Luces contar = new Luces();
    
    public void empezar(){
        
        System.out.println("-CONTROL DE LUCES AUTOMATICO-");
        System.out.println("1. Iniciar");
        System.out.println("2. Salir");
        int iniciar = sc.nextInt();
        
        if(iniciar == 1){
            empezar.controlar();
            contar.getArrayluces();
        }
    }
    
}
