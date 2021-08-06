package codeforces;

import java.util.Scanner;
 
public class NextRound {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        int k = in.nextInt();
 
        int[] contestants = new int[n];
        for (int i = 0; i < n; i++) {
            contestants[i] = in.nextInt();
        }
 
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (contestants[i] >= contestants[k-1]&&contestants[i]>0) {
            count++;
            }
        }
 
        System.out.println(count);
 
    }
 
}