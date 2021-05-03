package com.mycompany.icc700.guia1;

import java.util.Scanner;

public class AreaTrianguloLadosAngulo {
    public static void main(String[] args) {
        
        double a, b, C;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el primer lado: ");
        a = in.nextDouble();
        
        while(a<0){
            System.out.println("Ingrese un valor válido: ");
            a = in.nextDouble();
        }
        
        System.out.println("Ingrese el segundo lado: ");
        b = in.nextDouble();
        
        while(b<0){
            System.out.println("Ingrese un valor válido: ");
            b = in.nextDouble();
        }
        
        System.out.println("Ingrese el ángulo: ");
        C = in.nextDouble();
        
        //Esta validacion puede ser distinta, ya que los ángulos negativos no son necesariamente
        //inválidos y 0 simplemente daria como respuesta una linea recta ademas de que se puede
        //ingresar un ángulo en radianes y habria que hacer una transformacion.
        while(C<=0){
            System.out.println("Ingrese un valor válido");
            C = in.nextDouble();
        }
        
        System.out.println("El área de su triangulo es: "+((b*a)*Math.sin(C))/2);
        
    }
}
