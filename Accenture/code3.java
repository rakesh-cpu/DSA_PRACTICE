package Accenture;
import java.util.*;
public class code3 {

    public static int findAbsoluteMinDif(int[] arr,int value){
        int min = Math.abs(arr[0]-value);
        int idx = 0;
        for(int i=1;i<arr.length;i++){
            if(min>Math.abs(arr[i]-value)){
                idx = i;
            }
            min = Math.min(min,Math.abs(arr[i]-value));
            System.out.println(min);
            System.out.println(idx);
               
        }


        return arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number to be checked with:");
        int value = sc.nextInt();
        int res = findAbsoluteMinDif(arr,value);
        System.out.println(res);
    }
}
