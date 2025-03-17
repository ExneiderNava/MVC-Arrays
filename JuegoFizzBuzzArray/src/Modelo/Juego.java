
package Modelo;
import java.util.ArrayList;


public class Juego {
    
    static ArrayList<Runnable> juegos = new ArrayList<>();
    
    //el rango se usara para empezar el juego de acuerdo a un rango de numeros que especifica el usuario
    
    int rango1, rango2;
    
    public Juego(){
        
    }
    
    public Juego(int rango1, int rango2){
        this.rango1 = rango1;
        this.rango2 = rango2;
    }
    
    // empieza a correr el juego
    public void jugar(){
        for(int i = rango1; i <= rango2; i++){
            if(i %3 == 0 && i %5 == 0){
                System.out.println("FIZZ BUZZ");
            } else if(i %5 == 0){
                System.out.println("BUZZ");
            } else if(i %3 == 0){
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
        }
        
    }
    
    public void almacenar(){
        juegos.add(() -> jugar());
    }
    
    public void mostrarresultados(){
        
        System.out.println("Partidas jugadas" + juegos.size());
        
        for(int i = 0; i<juegos.size(); i++){
            System.out.println("ejecutando juego " + (i+1));
            juegos.get(i).run();
            System.out.println("-------------------------");
        }
    }
    
    
}
