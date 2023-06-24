package Strings;
import java.util.*;
public class TrillingProblem {
    public static void decryptString(String str,int k){
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int n = Character.getNumericValue(ch);
                System.out.println(n);
                while(n>0){
                    result.append(temp);
                    n--;
                }
                temp.setLength(0);
            }
        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("enter kth numbers:");
        int k = sc.nextInt();
        decryptString(str,k);
        sc.close();
    }
}
        
                    
        
                
                
                
                
            
