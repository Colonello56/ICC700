package com.mycompany.icc700.guia1;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        
        int date, currentDate;
        currentDate = 2021;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el año en que nació: ");
        date = in.nextInt();
        
        while(date<0){
            System.out.println("Ingrese un valor válido: ");
            date = in.nextInt();
        }
        
        System.out.println("La edad es: "+(currentDate-date));
        
    }
}