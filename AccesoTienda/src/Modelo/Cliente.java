
package Modelo;


public class Cliente {
    
    private boolean Membresia, empleado;
    private String nombre, apellido;
    private int siono;
    
    //si la membresia es true significa que esta valida

    public Cliente(int Membresia, String nombre, String apellido) {
        this.siono = Membresia;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void autorizar(){
        if(siono == 1){
            Membresia = true;
        } else if(siono == 2) {
            Membresia = false;
        }
    }
    
    public boolean getMembresia(){
        return Membresia;
    }
    
    public boolean getEmpleado(){
        return empleado;
    }
    
    public void setEmpleado(int esEmpleado){
        if(esEmpleado == 1){
            empleado = true;
        } else if(esEmpleado == 2){
            empleado = false;
        }
    }
    
    
    
}
