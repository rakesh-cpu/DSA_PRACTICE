// print true if Pythogorous theorem satisfy the taken 3 numbers
package Day1;
import java.util.*;
public class Pythogorous {
    public static void checkPythogourous(int a,int b ,int c){
        int max = a;
        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;

        }
        if(max==a){
            boolean flag = ((b*b)+(c*c)==(a*a));
            System.err.println(flag);
        }
        if(max==b) {
            boolean flag = ((c*c)+(a*a)==(b*b));
            System.out.println(flag);
            
        } else {
            boolean flag = ((a*a)+(b*b)==(c*c));
            System.out.println(flag);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkPythogourous(a,b,c);

    }
}
