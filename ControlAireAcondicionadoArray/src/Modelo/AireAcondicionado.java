
package Modelo;
import java.util.ArrayList;


public class AireAcondicionado {
    
    static ArrayList<Integer>Encendidas = new ArrayList<>();
    
    private static boolean encendido = false;
    private double temperatura, procentajeHumedad;
    
    public AireAcondicionado(){
        
    }
    
    public AireAcondicionado(double temperatura, double porHumedad){
        this.temperatura = temperatura;
        this.procentajeHumedad = porHumedad;
    }
    
    public void activar(){
        
        if(temperatura > 18 && procentajeHumedad > 60){
            System.out.println("Encendiendo Aire Acondicionado");
            encendido = true;
            Encendidas.add(1);
        } else if(temperatura > 30){
            System.out.println("Endendiendo Aire Acondicionado");
            encendido = true;
            Encendidas.add(1);
        } else{
            System.out.println("Apagando Aire Acondicionado");
            encendido = false;
        }
        
    }
    
    public boolean getEncendido(){
        return encendido;
    }
    
    public int getencendidas(){
        return Encendidas.size();
    }
    
}
