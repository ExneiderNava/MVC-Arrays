
package Modelo;
import java.util.ArrayList;


public class Luces {
    static ArrayList<Integer>Encedidas = new ArrayList<>();
    
    private static boolean noche, movimiento, luces = false;
    
    public void ingresarDia(int dia){
        
        if(dia == 1){
            this.noche = false;
        } else if(dia == 2){
            this.noche = true;
        }
        
    }
    
    public void movimiento(int movimiento){
        if(movimiento == 1){
            this.movimiento = true;
        } else if(movimiento == 2){
            this.movimiento = false;
        }
    }
    
    public void encenderLuces(){
        
        if(noche && movimiento){
            System.out.println("Encendiendo luces");
            luces = true;
            Encedidas.add(1);
        } else if(noche == false || movimiento == false ){
            System.out.println("Apagando luces");
            luces = false;
        }
        
    }
    
    public void getLuces(){
        if(luces){
            System.out.println("luces Encendidas");
        } else {
            System.out.println("luces apagadas");
        }
    }
    
    public void getArrayluces(){
        System.out.println("Las luces se encendieron " + Encedidas.size() + " Veces");
    }
    
}

//si es de noche y hay movimiento se encienden las luces
// si es de dia oooo no hay movimiento las luces se apagan