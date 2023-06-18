package recursion;
import java.util.Scanner;


public class StocksBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("enter prices:");
        for(int i=0;i<prices.length;i++){
            prices[i] = sc.nextInt();

        }
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(pist > op){
                op = pist;

            }
        }
        System.out.println("overal profit is:"+op);
    }
}
