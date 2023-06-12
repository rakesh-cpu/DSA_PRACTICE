package recursion;

public class practice1 {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    static void printnumber(int a,int b,int n){
        if(n<0){
            return;
        }
        System.out.print(a+" ");
        int c=a+b;
        a=b;
        b=c;
        printnumber(a,b,n-1);
        // System.out.println("got return call from "+n);
        // System.out.println(n);
        
    }
    public static void main(String[] args) {
        
        int a=0,b=1;
        int n=6;
        printnumber(a,b,n);
    }
}

