package com.mycompany.icc700.guia1;

import java.util.Scanner;

public class ConversorCLPUSD {
    public static void main(String[] args) {
        
        double clp, usd;
        Scanner in = new Scanner(System.in);
        
        //Aqui iria una conexion a un servicio de informacion acerca
        //de el valor de la moneda(s) que se quiere convertir.
        usd = 700;
        
        System.out.println("Ingrese la cantidad de dinero Chileno a convertir: ");
        clp = in.nextDouble();
        
        while(clp<0){
            System.out.println("Ingrese un valor válido: ");
            clp = in.nextDouble();
        }
        
        System.out.println("La cantidad en USD es: "+clp/usd);
        
    }
}
