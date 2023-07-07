package Stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextGreateElement {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
    }
}
