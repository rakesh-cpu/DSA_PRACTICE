package Strings;

import java.util.Scanner;

public class permutation {

    public static void solution(String str){
        int len = str.length();
        int np = fact(len);
        for(int i=0;i<np;i++){
            StringBuilder sub = new StringBuilder(str);
            int temp = i;
            for(int div=len;div>0;div--){
                int q = temp/div;
                int r = temp%div;

                temp=q;
                System.out.print(sub.charAt(r));
                sub.deleteCharAt(r);

            }
            System.out.println();
        }
    }
    public static int fact(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String:");
        String str = sc.next();
        solution(str);
    }
}
