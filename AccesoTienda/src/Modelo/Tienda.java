
package Modelo;


public class Tienda {
    
    private int apertura = 6;
    private int clausura = 20;
    private int hora;
    private boolean dentrodelHorario;
    
    public Tienda(int hora){
       this.hora = hora;
    }
    
    public void verificar(){
        if(hora >= apertura && hora <= clausura){
            dentrodelHorario = true;
        } else {
            dentrodelHorario = false;
        }
    }
    
    public boolean getHorario(){
        return dentrodelHorario;
    }
    
    
    
}
