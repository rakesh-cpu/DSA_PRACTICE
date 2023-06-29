package SortingAlgo;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int arr[],int lo,int hi){
        if(lo>hi){
            return;
        }

        int pivot = arr[hi];
        int pi = partitionArray(arr,pivot,lo,hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi+1, hi);

    }
    public static int partitionArray(int arr[],int pivot,int lo,int hi){
        
        int i=lo,j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return (j-1);
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j]  = temp;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int startT = (int) System.nanoTime();
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr = Arrays.stream(arr).map(i->sc.nextInt()).toArray();
        System.out.println("the unsorted arrays is:"+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int endT = (int) System.nanoTime();
        int time = endT - startT;
        System.out.println(time);
    }
}
