package TwoDimentional;

import java.util.Scanner;

public class SpiralMatrix {
    public static void printSpiralMatrix(int arr[][]){
        int left=0,right=arr[0].length-1;
        int down= arr.length;
        
        int row = 0;
        while(left<=right){
            for(int ptr1=left;ptr1<=right;ptr1++){
                System.out.print(arr[left][ptr1]);
            }
            row+=1;
            for(int ptr2=row;ptr2<=down;ptr2++){
                System.out.print(arr[ptr2][right]);
            }
            right-=1;
            for(int ptr3=right;ptr3>=left;ptr3--){
                System.out.print(arr[down][ptr3]);
            }
            down-=1;
            for(int ptr4=down;ptr4>=row;ptr4--){
                System.out.print(arr[ptr4][left]);
            }
            left+=1; 
            
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
        System.out.println("the 2 dimentional array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        printSpiralMatrix(arr);

    }
}
