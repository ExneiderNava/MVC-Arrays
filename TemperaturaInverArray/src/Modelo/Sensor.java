
package Modelo;


public class Sensor {
    
    double temperatura;
    static String Estado = "Inactivo";
    
    public Sensor(){
        
    }

    public Sensor(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public void ejecutar(){
        if(temperatura < 10){
            System.out.println("Activando calefactor");
            Estado = "Calefactor Activado";
        } else if(temperatura > 25){
            System.out.println("Activando ventilador");
            Estado = "Ventilador Activado";
        } else {
            System.out.println("Calefactor y ventilador apagado");
        }
    }
    
    public String getEstado(){
        return Estado;
    }
    
    //estas funciones deben interactuar en la vista
    
    
    
    
}
