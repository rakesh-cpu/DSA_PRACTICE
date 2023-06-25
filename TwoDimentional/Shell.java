package TwoDimentional;

import TwoDimentional.RotateArrayKtimes;
import java.util.*;

public class Shell {

    public static void rotateShell(int matrix[][], int sn, int k) {

        RotateArrayKtimes rotateKtime = new RotateArrayKtimes();

        int[] oned=fillOnedFromShell(matrix,sn);
        int onedR[]=rotateKtime.rotate(oned, k);
        fillShell(matrix, sn, onedR);
    }
    
    public static int[] fillOnedFromShell(int matrix[][],int sn){
        int minr = sn - 1, minc = sn - 1;
        int maxr = matrix.length - sn, maxc = matrix[0].length - sn;
        int rows = maxr - minr;
        int cols = maxc - minc;
        int size = 2 * (rows + cols);
        int oned[] = new int[size];
        int idx = 0;
        for (int r = minr, c = minc; r <= maxr; r++) {
            oned[idx] = matrix[r][c];
            idx++;
        }
        for (int r = maxr, c = minc + 1; c <= maxc; c++) {
            oned[idx] = matrix[r][c];
            idx++;
        }
        for (int r = maxr - 1, c = maxc; r >= minr; r--) {
            oned[idx] = matrix[r][c];
            idx++;
        }
        for (int r = minr, c = maxc - 1; c >= minc+1; c--) {
            oned[idx] = matrix[r][c];
            idx++;
        }

        for (int element : oned) {
            System.out.print(element + " ");
        }
        return oned;
    }

    public static void fillShell(int matrix[][], int sn, int[] onedR) {
        int minr = sn - 1, minc = sn - 1;
        int maxr = matrix.length - sn, maxc = matrix[0].length - sn;
        int idx = 0;
        for (int r = minr, c = minc; r <= maxr; r++) {
            matrix[r][c] = onedR[idx];
            idx++;
        }
        for (int r = maxr, c = minc + 1; c <= maxc; c++) {
            matrix[r][c] = onedR[idx];
            idx++;
        }
        for (int r = maxr - 1, c = maxc; r >= minr; r--) {
            matrix[r][c] = onedR[idx];
            idx++;
        }
        for (int r = minr, c = maxc - 1; c > minc; c--) {
            matrix[r][c] = onedR[idx];
            idx++;
        }

        

    }
    public static void display(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k] + " ");

            }
            System.out.println();
        }
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

        System.out.println("select shell to rotate:");
        int sn = sc.nextInt();
        System.out.println("select number of rotations:");
        int k = sc.nextInt();

        rotateShell(arr, sn, k);
        System.out.println();
        display(arr);
    }
    
}
