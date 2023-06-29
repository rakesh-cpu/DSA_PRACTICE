package SortingAlgo;
import java.util.*;
public class QuickSelect {
    public static int quickSelect(int arr[],int lo,int hi,int k){
        int pivot = arr[hi];
        int pi = QuickSort.partitionArray(arr, pivot, lo, hi);
        if(k<pi){
            return quickSelect(arr, lo, pi-1, k);
        }
        else if(k>pi){
            return quickSelect(arr,pi+1,hi, k);
        }
        else{
            return pivot;
        }

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        arr = Arrays.stream(arr).map(i->sc.nextInt()).toArray();
        System.out.print(Arrays.toString(arr));
        int kthmin = sc.nextInt();
        int ele = quickSelect(arr,0,arr.length-1,kthmin-1);
        System.out.println(ele);

    }
}
