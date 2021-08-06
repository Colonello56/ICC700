package codeforces;

import java.util.Scanner;

public class SoldierAndBananas{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k,n,w;

        k = in.nextInt();
        n = in.nextInt();
        w = in.nextInt();

        for(int i = 1; i<=w;i++){
            n -= i*k;
        }

        if(n<0){
            System.out.print(Math.abs(n));
        }else{
            System.out.print(0);
        }
    }
}