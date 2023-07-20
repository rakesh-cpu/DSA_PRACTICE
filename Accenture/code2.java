// java program to find number of cards needed to build a pyramid of level N


package Accenture;
import java.util.*;
public class code2 {
    public static int findCardsRequired(int n){
        return n*(3*n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter level:");
        int level = sc.nextInt();
        System.out.println(findCardsRequired(level));

    }
}
