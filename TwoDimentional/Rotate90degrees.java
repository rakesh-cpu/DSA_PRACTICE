package TwoDimentional;
import java.util.*;
public class Rotate90degrees {
    public static void display(int arr[][]){
        System.out.println("the 2 dimentional array is:");
        int row=arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void rotate90degrees(int arr[][]){
        // transpose array
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse row 
        for(int i=0;i<arr.length;i++){
            int li=0;
            int ri = arr[i].length-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter two dimentional array elements");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        display(arr);
        rotate90degrees(arr);
        display(arr);
    }
}
