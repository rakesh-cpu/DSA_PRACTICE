package TwoDimentional;

import java.util.*;
public class ExitPointMatrix {

    public static void ExitMatrix(int arr[][]){
        int dir =0;
        int i=0;
        int j=0;
        while(true){
            dir = (dir+arr[i][j])%4;
            if(dir==0){ //east
                j++;
            }
            else if(dir==1){ //south
                i++;
            }
            else if(dir==2){ //west
                 j--;
            }
            else if(dir==3){ //north
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;


            }
            else if(i==arr.length){
                i--;
                break;
            }
        }
        System.out.println("The exist point of matrix is :@"+"("+i+","+j+")");


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
        ExitMatrix(arr);


    }
}
