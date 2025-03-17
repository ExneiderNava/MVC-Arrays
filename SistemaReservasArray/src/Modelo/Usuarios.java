
package Modelo;
import java.util.Scanner;

public class Usuarios {
    Scanner sc = new Scanner(System.in);
    
    private String nombre, Apellido;
    
    public Usuarios(){
        this.nombre = nombre;
        this.Apellido = Apellido;
    }
    
    public Usuarios(String nombre, String apellido){
        this.nombre = nombre;
        this.Apellido = apellido;
    }
    
    public void getDatos(){
        System.out.println(nombre + " "+ Apellido);
    }
    
    
    
}
