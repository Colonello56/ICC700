package com.mycompany.icc700.guia1;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EdadFecha {
    public static void main(String[] args) throws ParseException {
        String date = null;
        Scanner in = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy");
        
        System.out.println("Ingrese la fecha de nacimiento (dia/mes/año): ");
        date = in.nextLine();
        
        Date formattedDate = format.parse(date);
        
    }
}