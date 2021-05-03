//Esta solución no considera las unidades de los valores ingresados
//ya que independiende de la unidad, los cálculos serán iguales.

package com.mycompany.icc700.guia1;

import java.util.Scanner;

public class AreaTrianguloBaseAltura {
    public static void main(String[] args) {
        
        double base, altura;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la base del triangulo: ");
        base = in.nextDouble();
        
        while(base < 0){
            System.out.println("Ingrese un valor válido: ");
            base = in.nextDouble();
        }
        
        System.out.println("Ingrese el valor de la altura del triangulo: ");
        altura = in.nextDouble();
        
        while(altura < 0){
            System.out.println("Ingrese un valor válido: ");
            altura = in.nextDouble();
        }
        
        System.out.println("El área de su triangulo es: "+((base*altura)/2));
        
    }
}
