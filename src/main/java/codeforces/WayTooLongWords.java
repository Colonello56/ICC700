package codeforces;

import java.util.Scanner;
 
public class WayTooLongWords {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
 
        String[] words = new String[n];
 
        for(int i=0;i<n;i++){
            words[i]=in.next();
        }
 
        for(int i=0;i<n;i++){
            if(words[i].length()>10){
                System.out.println(words[i].charAt(0)+""+(words[i].length()-2)+""+words[i].charAt(words[i].length()-1));
            }else {
                System.out.println(words[i]);
            }
        }
 
    }
 
}