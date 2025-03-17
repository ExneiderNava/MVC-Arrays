
package Vista;
import java.util.Scanner;
import Modelo.Calculadora;
import java.util.ArrayList;


public class CalcularUsuario {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> resultados = new ArrayList<>();
    
    public void ingresar(){
        
        int decision = 0;
        
        do{
        System.out.println("numero 1");
        int num1 = sc.nextInt();
        System.out.println("numero 2");
        int num2 = sc.nextInt();
        
        Calculadora calcular = new Calculadora(num1, num2);
        
        System.out.println("Ingrese la operación que desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int operacion = sc.nextInt();
        
        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + calcular.Sumar());
                resultados.add(calcular.Sumar());
                break;
            case 2:
                System.out.println("Resultado: " + calcular.restar());
                resultados.add(calcular.restar());
                break;
            case 3:
                System.out.println("Resultado: " + calcular.multiplicar());
                resultados.add(calcular.multiplicar());
                break;
            case 4:
                System.out.println("Resultado: " + calcular.dividir());
                resultados.add(calcular.dividir());
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
        
        System.out.println("quieres hacer otro calculo?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = sc.nextInt();
        
        }while(decision != 2);
        
        System.out.println("quieres ver el historial de sultados?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int resultado = sc.nextInt();
        
        if(resultado == 1){
            imprimirLista();
        }
        
    }
    
    public void imprimirLista(){
        for(int i = 0; i<resultados.size(); i++){
            System.out.println("Resultado " + (i+1) + " " + resultados.get(i));
        }
    }
    
}
