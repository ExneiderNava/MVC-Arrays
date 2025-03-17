
package Modelo;

public class Asientos extends Sala{
    
    
    private int asientos = 60;
    private int asientosRestar;
    private int asientospedido = 0;
    
    public Asientos(){
        asientos = 0;
        asientospedido = 0;
    }
    
    public Asientos(String nomsala, int nmAsiento){
        super(nomsala);
        this.asientosRestar = nmAsiento; 
    }
    
    public int getAsientos(){
        return asientos;
    }
    
    public int getAsientosPedidios(){
        return asientospedido;
    }
    
    public int restarAsientos(){
        return asientos -= asientosRestar;
    }
    
    public void setAsientos(int canAsientos){
        this.asientosRestar = canAsientos;
    }
   
    
   
 }
    

