package com.mycompany.icc700;

//import java.text.DecimalFormat;

public class EjemploStringFormat {
    public static void main(String[] args) {
        int min = 5;
        String numOut = null;
        
        //DecimalFormat df = new DecimalFormat("00");
        
        if (min < 10){
            //numOut = df.format(num);
            numOut = String.format("%02d",min);
        }
        
        System.out.println(numOut);
        
    }
}