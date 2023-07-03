package TwoDimentional;

import java.util.*;

public class SearchInTwoDarray {
    public static void SearchIn2dArray(int matrix[][], int n) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == n) {
                System.out.println("found:");
                return;
                
            } else if (matrix[i][j] > n) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter two dimentional array elements");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("the 2 dimentional array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("enter searching key:");
        int n = sc.nextInt();
        SearchIn2dArray(arr, n);
    }
}
