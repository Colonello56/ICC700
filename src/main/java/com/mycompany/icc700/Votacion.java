package com.mycompany.icc700;
import java.util.Scanner;

public class Votacion {
    public static void main(String[] args) {
        double risk1, risk2, rent1, rent2;
        int vot1, vot2, vot3;
        
        Scanner in = new Scanner(System.in);
        
        //Entrada y validacion de entradas.
        System.out.println("Ingrese el Riesgo del proyecto 1: ");
        risk1 = in.nextDouble();
        while(risk1<0){
            System.out.println("Ingrese un numero valido: ");
            risk1 = in.nextDouble();
        }
        System.out.println("Ingrese la Rentabilidad del proyecto 1: ");
        rent1 = in.nextDouble();
        while(rent1<0){
            System.out.println("Ingrese un numero valido: ");
            rent1 = in.nextDouble();
        }
        System.out.println("Ingrese el Riesgo del proyecto 2: ");
        risk2 = in.nextDouble();
        while(risk2<0){
            System.out.println("Ingrese un numero valido: ");
            risk2 = in.nextDouble();
        }
        System.out.println("Ingrese la Rentabilidad del proyecto 2: ");
        rent2 = in.nextDouble();
        while(rent2<0){
            System.out.println("Ingrese un numero valido: ");
            rent2 = in.nextDouble();
        }
        
        //Lógica del voto 1.
        if(rent1>rent2){
            if(risk1<risk2 && risk1<=60){
                vot1 = 1;
            }else if(risk2<risk1 && risk2<=60){
                vot1 = 2;
            }else{
                vot1 = 0;
            }
        }else if(rent2>rent1){
            if(risk2<risk1 && risk2<=60){
                vot1 = 2;
            }else if(risk1<risk2 && risk1<=60){
                vot1 = 1;
            }else{
                vot1 = 0;
            }
        }else{
            vot1 = 0;
        }
        
        //Lógica del voto 2.
        if(rent1<rent2){
            if(risk1<risk2 && risk1<=30){
                vot2 = 1;
            }else if(risk2<risk1 && risk2<=30){
                vot2 = 2;
            }else{
                vot2 = 0;
            }
        }else if(rent2>rent1){
            if(risk2<risk1 && risk2<=30){
                vot2 = 2;
            }else if(risk1<risk2 && risk1<=30){
                vot2 = 1;
            }else{
                vot2 = 0;
            }
        }else{
            vot2 = 0;
        }
        
        //Lógica del voto 3.
        if(risk1<risk2){
            if(risk1>60 && rent1>50){
            vot3 = 1;
            }else if(risk1<10 && risk2<10){
                if(rent1>rent2){
                    vot3 = 1;
                }else if(rent2>rent1){
                    vot3 = 2;
                }else{
                    vot3 = 0;
                }
            }else{
                vot3 = 1;
            }
        }else if(risk2<risk1){
            if(risk2>60 && rent2>50){
                vot3 = 2;
            }else if(risk2<10 && risk1<10){
                if(rent2>rent1){
                    vot3 = 2;
                }else if(rent1>rent2){
                    vot3 = 1;
                }else{
                    vot3 = 0;
                }
            }else{
                vot3 = 2;
            }
        }else{
            vot3 = 0;
        }
        
        //Salida de los votos.
        System.out.println("El socio 1 votó: ");
        switch (vot1) {
            case 1 -> System.out.println("Proyecto 1.");
            case 2 -> System.out.println("Proyecto 2.");
            case 0 -> System.out.println("Indeciso.");
        }
        
        System.out.println("El socio 2 votó: ");
        switch (vot2) {
            case 1 -> System.out.println("Proyecto 1.");
            case 2 -> System.out.println("Proyecto 2.");
            case 0 -> System.out.println("Indeciso.");
        }
        
        System.out.println("El socio 3 votó: ");
        switch (vot3) {
            case 1 -> System.out.println("Proyecto 1.");
            case 2 -> System.out.println("Proyecto 2.");
            case 0 -> System.out.println("Indeciso.");
        }
    }
}