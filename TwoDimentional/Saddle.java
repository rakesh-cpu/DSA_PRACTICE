package TwoDimentional;
import java.util.*;
public class Saddle {
    public static void findSaddlePoint(int arr[][]){
        int sdj=0;
        for(int step=0;step<arr.length;step++){
            for(int j=0;j<arr.length;j++){
                
                if(arr[step][sdj]<arr[step][j]){
                    sdj =j; 

                }


            }
            boolean flag = true;
            
            for(int k=0;k<arr.length;k++){
                if(arr[step][sdj]>arr[k][sdj]){
                    flag= false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[step][sdj]);
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
        findSaddlePoint(arr);
    }
    
}
