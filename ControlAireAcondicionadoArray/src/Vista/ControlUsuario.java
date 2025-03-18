
package Vista;
import java.util.Scanner;
import Modelo.AireAcondicionado;
import java.util.ArrayList;

public class ControlUsuario {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double>temperaturas = new ArrayList<>();
    ArrayList<Double>humedas = new ArrayList<>();
    AireAcondicionado veces = new AireAcondicionado();
    
    public void controlAire(){
        
        int cambio = 0;
        
        do{
        
        System.out.println("Ingrese la temperatura");
        double tem = sc.nextDouble();
        temperaturas.add(tem);
        
        System.out.println("Ingrese el porcentaje de la humedad actual");
        double humedad = sc.nextDouble();
        humedas.add(humedad);
        
        AireAcondicionado manipular = new AireAcondicionado(tem, humedad);
        
        manipular.activar();
        
        //se debe imprimir en que estado esta el aire
        
        if(manipular.getEncendido()){
            System.out.println("El aire Acondicionado esta encendido");
        } else {
            System.out.println("El aire Acondiciona esta apagado");
        }
        
        System.out.println("1. Cambio de temperatura");
        System.out.println("2. Salir");
        cambio = sc.nextInt();
        
        }while (cambio != 2);
        
        
    }
    
    public void getArray(){
        
        System.out.println("-TEMPERATURAS Y HUMEDADES INGRESADAS");
        for(int i = 0; i<temperaturas.size(); i++){
            
                
                System.out.println("Temperatura: " + temperaturas.get(i) + " Humedad: " + humedas.get(i));
                
            
        }
        
        
        System.out.println("El aire acondicionado fue encendido " +  veces.getencendidas() + " Veces");
    }
    
}
