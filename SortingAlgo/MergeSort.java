package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static int[] mergeSort(int arr[],int li,int hi){
        if(li == hi ){
            int[] ba = new int[1];
            ba[0] = arr[li];
            return ba;
        }
        int mid = (li+hi)/2;
        int fsh[] = mergeSort(arr, li, mid);
        int ssh[] = mergeSort(arr,mid+1,hi);
        int fsa[] = mergeTwoSortedArrays(fsh,ssh);
        return fsa;
        
        
    }
    public static int[] mergeTwoSortedArrays(int arr1[],int arr2[]){
        int f = arr1.length,s=arr2.length;
        int mArray[] = new int[f+s];
        int idx=0,fptr=0,sptr=0;
        while(fptr<f && sptr<s) mArray[idx++] = arr1[fptr] < arr2[sptr] ? arr1[fptr++] : arr2[sptr++];
        while(fptr<f) mArray[idx++] = arr1[fptr++];
        while(sptr<s) mArray[idx++] = arr2[sptr++];
        return mArray;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        arr = Arrays.stream(arr).map(i->sc.nextInt()).toArray();
        System.out.println(Arrays.toString(arr));
        int[] sortedArray=mergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(sortedArray));
        sc.close();
    }
}





