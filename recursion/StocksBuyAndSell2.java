package recursion;
import java.util.*;
public class StocksBuyAndSell2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number of stocks:");
        int n = sc.nextInt();
        System.out.println("enter prices:");
        int[]  prices = new int[n];

        for(int i=0;i<prices.length;i++){
            prices[i] = sc.nextInt();
        }
        int sd =0;
        int bd = 0;
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=prices[i-1]){
                sd++;

            }
            else{
                profit+=prices[sd] - prices[bd];
                bd=sd+i;


            }

        }
        profit+=sd-bd;

        System.out.println(profit);


    }
    
}
