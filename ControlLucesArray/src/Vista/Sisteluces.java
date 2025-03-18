
package Vista;
import java.util.Scanner;
import Modelo.Luces;

public class Sisteluces {
    Scanner sc = new Scanner(System.in);
    Luces sistema = new Luces();
            
    
    public void controlar(){
        
        int restar = 0;
        
        do{
        
        System.out.println("Estado actual de las luces");
        sistema.getLuces();
        
        System.out.println("Presiona 1 si es de dia");
        System.out.println("Si es de noche presiona 2");
        int noche = sc.nextInt();
        
        sistema.ingresarDia(noche);
       
        
        System.out.println("Hay movimiento?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        int movimiento = sc.nextInt();
        
        sistema.movimiento(movimiento);
        
        sistema.encenderLuces();
        
        System.out.println("1. Volver a verificar");
        System.out.println("2. Salir");
        restar = sc.nextInt();
        
        if(restar == 1){
            for(int i = 10; i>= 0; i--){
                System.out.println(i);
            }
        }
        
        }while(restar != 2);
        
        
        
        
        
    }
    
    //mostrar el estado de las luces cada 10 segundos
    
  
}
