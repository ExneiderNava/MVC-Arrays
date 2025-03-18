
package Vista;
import java.util.Scanner;
import Modelo.Cliente;
import Modelo.Tienda;
import java.util.ArrayList;


public class IngresarCliente {
    Scanner sc = new Scanner(System.in);
    ArrayList<String>NombresClientes = new ArrayList<>();
    ArrayList<String>apellidosClientes = new ArrayList<>();
    ArrayList<Integer>numerodeentradas = new ArrayList<>();
    boolean entrada;
    
    public void verificar(){
        
        int detener = 0;
        
        do{
        
        System.out.println("Nombre del cliente");
        String nombre = sc.nextLine();
        NombresClientes.add(nombre);
        System.out.println("Apellido del cliente");
        String apellido = sc.nextLine();
        apellidosClientes.add(apellido);
        System.out.println("tiene una membresia valida");
        System.out.println("1. si");
        System.out.println("2. no");
        int membresia = sc.nextInt();
        
        Cliente NuevoCleinte = new Cliente(membresia, nombre, apellido);
        
        NuevoCleinte.autorizar();
        
        System.out.println("A que horas esta ingresando");
        System.out.println("indique solo la hora en formato militar");
        int hora = sc.nextInt();
        
        Tienda horario = new Tienda(hora);
        
        horario.verificar();
        
        System.out.println("El cliente que esta ingresando es empleado?");
            System.out.println("1. si");
            System.out.println("2. no");
        int empleado = sc.nextInt();
        
        NuevoCleinte.setEmpleado(empleado);
        
        
        if(NuevoCleinte.getMembresia() && horario.getHorario()){
            entrada = true;
            numerodeentradas.add(1);
        } else if(NuevoCleinte.getEmpleado()){
            entrada = true;
            numerodeentradas.add(1);
        } else {
            entrada = false;
        }
        
        if(entrada){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        
            System.out.println("1. Esta ingresando un nuevo cliente");
            System.out.println("2. Salir");
            detener = sc.nextInt();
            
            sc.nextLine();
        
        }while(detener != 2);
        
    }
    
    public void setArrays(){
        System.out.println("CLIENTES INGRESADOS");
        
        for(int i = 0; i<numerodeentradas.size(); i++){
            
            System.out.println(NombresClientes.get(i) + " " + apellidosClientes.get(i));
            
        }
        
        System.out.println("Se les permitio el acceso a: " + numerodeentradas.size() + " Personas");
        System.out.println("Se realizaron " + NombresClientes.size() + " Solicitudes de acceso");
        
        System.out.println("CLIENTES QUE QUISIERON INGRESAR");
        
        for(int i= 0; i<NombresClientes.size(); i++){
            System.out.println(NombresClientes.get(i) + " " + apellidosClientes.get(i));
        }
    }
    
}
