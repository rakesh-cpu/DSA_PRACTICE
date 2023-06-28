package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void mtwoSortedArrays(int arr1[],int arr2[],int n,int m)
    {
    
        int mArray[] = new int[n+m];
        int f=0,s=0,idx=0;
        while(f<n && s<m) mArray[idx++] = arr1[f]<=arr2[s] ? arr1[f++] : arr2[s++];
        while(f<arr1.length) mArray[idx++] = arr1[f++];
        while(s<arr2.length) mArray[idx++] = arr2[s++];
        System.out.print(Arrays.toString(mArray));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first array size:");
        int n = sc.nextInt();
        System.out.println("enter second array size:");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("enter first array elements in sorted order:");
        arr1 = Arrays.stream(arr1).map(i->sc.nextInt()).toArray();
        System.out.println("enter second array elements in sorted order:");
        arr2 = Arrays.stream(arr2).map(i->sc.nextInt()).toArray();
        mtwoSortedArrays(arr1,arr2,n,m);
        sc.close();

    }
}
