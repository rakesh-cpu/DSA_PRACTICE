package TwoDimentional;
import java.util.*;



public class WavePrint {


    public static void printWave(int[][] arr){
    
        int col=0;
        for(int i=0;i<arr[0].length;i++){
        if(col%2==0){
            for(int row=0;row<arr.length;row++){
                System.out.print(arr[row][col]);
            }
            col++;
        }
        else{
            for(int row=arr.length-1;row>=0;row--){
                System.out.print(arr[row][col]);
            }
            col++;
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
        System.out.println("the 2 dimentional array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        printWave(arr);
    }
}
