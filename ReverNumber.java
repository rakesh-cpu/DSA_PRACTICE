// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class ReverNumber{
    public static void main(String[] args) {
        int n=-214;
        int y = Math.abs(n);
        String s = String.valueOf(y);
        int d = s.length();
        // System.out.println();
        int rem =0;
        long sum=0;
        for(int i=d-1;i>=0;i--){
            rem = n%10;
            sum=sum+(rem*(long)Math.pow(10,i));
            n = n/10;
            
            
            
        }
        
        
    
        if(n!=Math.abs(n)){
            System.out.println(sum*(-1));
        }
        else{
            System.out.println(sum);
        }
    }
}