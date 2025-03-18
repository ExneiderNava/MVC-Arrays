
package Modelo;


public class Sensores {
    
    private boolean sensor1 = false, sensor2 = false, sensor3 = false;
    private  static boolean alarma = false;
    
    
    public boolean SetSensor1(){
        return this.sensor1 = true;
    }
    public boolean SetSensor2(){
        return this.sensor2 = true;
    }
    public boolean SetSensor3(){
        return this.sensor3 = true;
    }
    
    public void VerificarAlarma(){
        if(sensor1 && sensor2){
            System.out.println("Activando alarma");
            alarma = true;
        } else if(sensor2 && sensor3){
            System.out.println("Activando alarma");
            alarma = true; 
        } else if(sensor1 && sensor3){
            System.out.println("Activando alarma");
            alarma = true;
        } else{
            System.out.println("No hay peligro");
        }
    }
    
    public boolean getAlarma(){
        return alarma;
    }
    
}

