package codeforces;

import java.math.BigInteger;
import java.util.Scanner;
 
public class TheatreSquare {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        double n = in.nextInt();
        double m = in.nextInt();
        double a = in.nextInt();
 
        double au1 = Math.ceil(n/a);
        double au2 = Math.ceil(m/a);
 
        System.out.println((long)(au1*au2));
 
    }
 
}