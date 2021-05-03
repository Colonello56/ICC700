//Esta solución no considera las unidades de los valores ingresados
//ya que independiende de la unidad, los cálculos serán iguales.

package com.mycompany.icc700.guia1;

import java.util.Scanner;

public class AreaTrianguloLados {
    public static void main(String[] args) {
        
        //Los tres lados: a, b y c, ademas de el semiperimetro: perimetro/2.
        double a, b, c, sp, area;
        Scanner in = new Scanner(System.in);
        
        //Validacion de lados, deben ser positivos y la suma de dos de ellos debe ser mayor al tercero.
        do{
            System.out.println("Ingrese el lado 1: ");
            a = in.nextDouble();
            
            while(a<0){
            System.out.println("Ingrese valor válido: ");
            a = in.nextDouble();
            }
        
            System.out.println("Ingrese el lado 2: ");
            b = in.nextDouble();
        
            while(b<0){
                System.out.println("Ingrese valor válido: ");
                b = in.nextDouble();
            }
        
            System.out.println("Ingrese el lado 3: ");
            c = in.nextDouble();
        
            while(c<0){
                System.out.println("Ingrese valor válido: ");
                c = in.nextDouble();
            }
        }while(a+b<=c || a+c<=b || b+c<=a);
        
        //Cálculo de el semiperimetro.
        sp = (a+b+c)/2;
        
        //Cálculo de área.
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        
        System.out.println("El área de su triangulo es: "+area);
        
    }
}
