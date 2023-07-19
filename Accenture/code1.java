package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class code1 {
    
    public static int checkSufficiency(int arr[],int r,int units){
        int req = r*units;
        int box = (int) arr.length/units;
        int sum = 0;
        int count = 1;
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=req){
                return count;
                
            }
            count++;
            
            
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r value:");
        int r = sc.nextInt();
        System.out.println("enter units :");
        int units = sc.nextInt();
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = Arrays.stream(arr).map(i->sc.nextInt()).toArray();
        int result = checkSufficiency(arr,r,units);
        System.out.println(result);

    }
}
