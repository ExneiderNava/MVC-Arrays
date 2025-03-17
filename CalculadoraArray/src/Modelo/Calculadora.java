
package Modelo;


public class Calculadora {
    
    int num1,num2;
    
    //en esta funcion se crearan varias funciones que retornaran resultados
    
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        
    }
    
    public int Sumar(){
        return num1+num2;
    }
    
    public int restar(){
        return num1-num2;
    }
     
    public int multiplicar(){
        return num1*num2;
    }
      
    public int dividir(){
        return num1/num2;
    }
    
}
