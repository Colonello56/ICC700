package codeforces;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] c = s.toCharArray();
        int u = 0;
        int l = 0;
        
        for(int i = 0; i<c.length; i++){
            if(Character.isUpperCase(c[i])){
                u++;
            }else{
                l++;
            }
        }

        if(u<l){
            System.out.print(s.toLowerCase());
        }else if(l<u){
            System.out.print(s.toUpperCase());
        }else{
            System.out.print(s.toLowerCase());
        }
    }
}
