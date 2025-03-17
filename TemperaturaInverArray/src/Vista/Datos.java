
package Vista;
import java.util.Scanner;
import Modelo.Sensor;
import java.util.ArrayList;


public class Datos {
      private Scanner sc = new Scanner(System.in);
      ArrayList<Double> temperaturas = new ArrayList<>();
    
    public void empezar(){
        
        int tem = 1;
    
        
            
       do{
       
        
        System.out.println("Estado Actual");
        Sensor estado = new Sensor();
        
            System.out.println(estado.getEstado());
        
        
        System.out.println("Ingrese la temperatura actual");
        double temperatura = sc.nextDouble();
        temperaturas.add(temperatura);
        
        Sensor termometro = new Sensor(temperatura);
        
        termometro.ejecutar();
        
        System.out.println("Presione 1 si Cambio la temperatura");
        System.out.println("de lo contrario presione 2");
        tem = sc.nextInt();
        
        if(tem == 1){
            for(int i = 5; i>=0; i--){
                System.out.println(i);
            }
        }
        
       }while(tem == 1);
        
          
            
    }
    
    public void setTemperaturas(){
        for(int i=0; i<temperaturas.size(); i++){
            System.out.println("Temperatura " +(i+1) + " " + temperaturas.get(i));
        }
    }
}
    
            
    

