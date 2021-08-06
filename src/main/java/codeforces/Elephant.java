package codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int s = 1;

        while(x>5){
            x-=5;
            s++;
        }
        System.out.print(s);
    }
}
