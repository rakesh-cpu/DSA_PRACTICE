package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(isGreater(arr,j,j+1)){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static boolean isGreater(int arr[],int i,int j){
        if(arr[i]>arr[j]){
            return true;

        }
        return false;
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
         arr[i] = arr[j];
        arr[j] = temp;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
