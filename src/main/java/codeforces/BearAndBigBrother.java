package codeforces;

import java.util.Scanner;

public class BearAndBigBrother{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,count=0;
        a = in.nextInt();
        b = in.nextInt();

        while(a<=b){
            a*=3;
            b*=2;
            count++;
        }

        System.out.print(count);
    }
}