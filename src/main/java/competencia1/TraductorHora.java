//Ejercicio no completo

package competencia1;
import java.util.Scanner;

public class TraductorHora {
    public static void main(String[] args) {
        int hora, min;
        String ampm;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la hora a traducir: ");
        hora = in.nextInt();
        
        while(hora < 0 || hora > 2359){
            System.out.println("Ingrese una hora válida por favor: ");
            hora = in.nextInt();
        }
        
        min = hora%((hora/100)*100);
        hora = hora/100;
        
//        if(hora>1159){
//            ampm = "PM";
//        }else{
//            ampm = "AM";
//        }
        
        System.out.println(String.format("%02d",(hora%12)) + ":" + min + " " + ((hora>=12) ? "PM" : "AM"));
    }
}
