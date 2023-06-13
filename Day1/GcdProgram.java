package Day1;
import java.util.*;

public class GcdProgram{
    
    public static int printGcd(int n1,int n2){
        if(n1==0){
            // System.out.println(n2);
            return n2;
        }
        return printGcd(n2%n1,n1);
    
    }
    
    
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int gcd = printGcd(n1,n2);
        int lcm = (int)(n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        
    }
}

