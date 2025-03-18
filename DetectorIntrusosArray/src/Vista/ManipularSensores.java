
package Vista;
import java.util.Scanner;
import Modelo.Sensores;

public class ManipularSensores {
    Scanner sc = new Scanner(System.in);
    Sensores detec = new Sensores();
    
    public void manipular(){
        
        System.out.println("Precione 1 si es de dia");
        System.out.println("Precione 2 si es de noche");
        int noche = sc.nextInt();
        
        if(noche == 1){
            System.out.println("Los sensores no funcionan de dia");
        } else if(noche == 2){
            
            if(detec.getAlarma()){
                System.out.println("Alarma encendida");
            } else{
                System.out.println("Alarma apagada");
            }
        
        System.out.println("Detectando movimientos");
        System.out.println("Scaneando.............");
        
        for(int i= 0; i<3; i++){
            System.out.println("Sensor " +(i+1) + " Detecta movimiento?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            int sensor = sc.nextInt();
            
            if(sensor== 1){
                switch(i){
                    case 0:
                        detec.SetSensor1();
                        break;
                    case 1:
                        detec.SetSensor2();
                        break;
                    case 2:
                        detec.SetSensor3();
                        break;
                }
                
            }
            
        }
        detec.VerificarAlarma();
        
        }
        
        
    }
    
}
