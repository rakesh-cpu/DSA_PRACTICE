package SortingAlgo;

import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mi = i;
            for(int j=i+1;j<arr.length;j++){
                if(isSmall(arr,j,mi))
                {
                    mi = j;
                }

            }
            swap(arr,i,mi);
        }
    }
    public static boolean isSmall(int arr[],int i,int j){
        System.out.println("comparing:"+arr[i]+"and"+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }
        return false;
    }
    public static void swap(int arr[],int i,int j){
        System.out.println("swapping"+arr[i]+" and "+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        System.out.println("enter array elements :");
        int arr[] =  new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the unsorted array is:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
