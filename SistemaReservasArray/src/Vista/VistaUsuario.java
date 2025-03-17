
package Vista;
import java.util.Scanner;
import Modelo.Usuarios;
import Modelo.Sala;
import Modelo.Asientos;
import java.util.ArrayList;

public class VistaUsuario {
    Scanner sc = new Scanner(System.in);
    ArrayList<String>Salas = new ArrayList<>();
    ArrayList<Integer>totalsillas = new ArrayList<>();
    
    
    public void reservarAsiento(){
        System.out.println("-inicio de seccion del usuario-");
        System.out.println("ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Apellido");
        String apellido = sc.nextLine();
        
        
        Usuarios usuario = new Usuarios(nombre, apellido);
        
        int opcion = 0;
        
        do{
        System.out.println("ingrese la Sede en donde se apartara el asiento");
        String sede = sc.nextLine();
        Salas.add(sede);
        
        Sala nomsede = new Sala(sede);
        // Esta funcion se usará cuando se necesite imprimir el nombre de la sala
        System.out.println("En esta sede tienes 60 Asientos disponibles");
        
        int decision = 0;
        
        
        System.out.println("Cuantos Asientos apartara en esta sede");
        int numasientos = sc.nextInt();
        totalsillas.add(numasientos);
        
        Asientos apartarAseientos = new Asientos(sede, numasientos);
        apartarAseientos.restarAsientos();
        
        do{
            
        
        if(apartarAseientos.getAsientos() > 0){
        
        System.out.println("quedan " + apartarAseientos.getAsientos() + " asientos disponibles");
        } else {
            System.out.println("no hay mas asientos disponibles");
            break;
        }
        System.out.println("quieres mas asientos?");
        System.out.println("1. si");
        System.out.println("2. no");
        decision = sc.nextInt();
        
        if(decision == 1){
                 
        System.out.println("Cuantos Asientos apartara en esta sede");
        int numasientos2 = sc.nextInt();
        totalsillas.add(numasientos2);
        
        apartarAseientos.setAsientos(numasientos2);
        
        //al parecer esta sera la solucion al problema
        
        apartarAseientos.restarAsientos();
        //esta funcion se creo para restarle a los asientos
        //dando solucion al problema
        }
        
        }while(decision != 2);
        
        System.out.println("El usuario");
        usuario.getDatos();
        System.out.println("Reservo asientos en la sala");
        nomsede.getSala();
        
        System.out.println("---------------------------------");
        System.out.println("1. reservar asientos en otra Sede");
        System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        sc.nextLine();
        
        }while(opcion != 2);
    }
    
    public void imprimir(){
        
        System.out.println("sedes en las que se hicieron reservas");
        
        for(int i = 0; i < Salas.size(); i++){
        System.out.println(Salas.get(i));
        }
        
        int sumasilla = 0;
        
        for(int i : totalsillas){
            sumasilla += i;
        }
        
        System.out.println("Total de sillas reservadas por este usuario: " + sumasilla);
        
        
        
        
    }
        
    
    
    
        
}
