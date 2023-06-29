package SortingAlgo;

import java.util.Scanner;
// import java.lang.*;
// 1902902204
// 1346203308

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(isSmall(arr,j+1,j)){
                    swap(arr,j+1,j);
                }
            }
        }
    }
    public static boolean isSmall(int arr[],int i,int j){
    System.out.println("comparing "+arr[i]+"and"+arr[j]);
    if(arr[i]<arr[j]){
        return true;
    }
    return false;
    }
    public static void swap(int arr[],int i,int j){
        System.out.println("swapping "+arr[i]+" and "+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startT = (int) System.nanoTime();
        System.out.println("enter array size:");
        int n = sc.nextInt();
        System.out.println("enter array elements:");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        bubbleSort(arr);
        for(int item : arr){
            System.out.println(item);
        }
        int endT = (int) System.nanoTime();
        int time = endT - startT;
        System.out.println(time);
    }
}
