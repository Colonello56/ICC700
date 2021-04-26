package com.mycompany.icc700;

import java.util.Scanner;

public class Pedidos {
    public static void main(String[] args) {
        int precioEnt, precioPri, precioPos, cantEnt, cantPri, cantPos;
    
        precioEnt = 500;
        precioPri = 1000;
        precioPos = 500;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Entrada a pedir: ");
        cantEnt = in.nextInt();
        
        while (cantEnt < 0){
            System.out.println("Ingrese un valor valido por favor");
            cantEnt = in.nextInt();
        }
        
        System.out.println("Ingrese la cantidad de Plato Principal a pedir: ");
        cantPri = in.nextInt();
        
        while (cantPri < 0){
            System.out.println("Ingrese un valor valido por favor");
            cantPri = in.nextInt();
        }
        
        System.out.println("Ingrese la cantidad de Postre a pedir: ");
        cantPos = in.nextInt();
        
        while (cantPos < 0){
            System.out.println("Ingrese un valor valido por favor");
            cantPos = in.nextInt();
        }
        
        System.out.println("Sus precios son: " + cantEnt*precioEnt + " en Entrada, " + cantPri*precioPri + " en Plato principal, " +
                            cantPos*precioPos + "en Postre, para un total de: " + (cantEnt*precioEnt+cantPri*precioPri+cantPos*precioPos));
        
    }
}