package com.mycompany.icc700;

import java.util.Scanner;

public class HaTosqM {
    public static void main(String[] args) {
        
        int operation;
        float input;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Desea convertir Hectáreas a Metros cuadrados (1) o Metros cuadrados a Hectáres (2)?");
        operation = in.nextInt();
        
        while (operation > 2 || operation < 1){
            System.out.println("Por favor ingrese una opcion valida: 1 o 2: ");
            operation = in.nextInt();
        }
        
        if (operation == 1){
            System.out.println("Ingrese el numero de Hectáreas a convertir: ");
            input = in.nextFloat();
            while (input < 0){
                System.out.println("Ingrese un valor válido por favor: ");
                input = in.nextFloat();
            }
            System.out.println("El numero de Metros cuadrados es: " + (input*10000) + " m^2.");
        }
        
        if (operation == 2){
            System.out.println("Ingrese el numero de Metros cuadrados a convertir: ");
            input = in.nextFloat();
            while (input < 0){
                System.out.println("Ingrese un valor válido por favor: ");
                input = in.nextFloat();
            }
            System.out.println("El numero de Hectáreas es: " + (input/10000) + " ha.");
        }
        
        
    }
}
