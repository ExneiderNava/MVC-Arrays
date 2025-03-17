
package Controlador;
import java.util.Scanner;
import Vista.Datos;


public class Menu {
    Scanner sc = new Scanner(System.in);
    
    public void Sensores(){
        
        System.out.println("Bienvenido al invernadero");
        System.out.println("Este es el sensor de temperatura");
        System.out.println("presione 1 para empezar");
        System.out.println("presione cualquier tecla para salir");
        int empezar = sc.nextInt();
        
        if(empezar == 1){
            Datos iniciar = new Datos();
            
            iniciar.empezar();
            
            System.out.println("Presione 1 para ver las temperaturas ingresadas");
            System.out.println("de lo contrario presione 2");
            int ver = sc.nextInt();
            
            if(ver == 1){
                iniciar.setTemperaturas();
            }
        }
        
    }
    
}
