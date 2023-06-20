package BinarySearchProblems;
import java.util.*;

public class SquareRoot {

    public static int squareRootofN(int n){
        int low=1,high=n;
        int ans = 0;
        while(low<=high){
            int mid = (int)(low+high)/2;
            if(mid*mid<=n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to find sqrt:");
        int n = sc.nextInt();
        System.out.println("The sqrt of "+n+"is:  "+squareRootofN(n));
        

    }
}
