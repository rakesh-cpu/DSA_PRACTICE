package recursion;
import java.util.*;
public class Numbers {
    public static void printNumbers(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void fibonacii(int a ,int b,int n)
    {
        if(n==6){
            return;

        }
        a = a+b;
        
        System.out.print(a+" "+b);
        fibonacii(b, b, n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("result is: ");
        printNumbers(n);
        int a =0;
        int b=0;
        int n=5;

        fibonacii(a,b,n);

    }
}
