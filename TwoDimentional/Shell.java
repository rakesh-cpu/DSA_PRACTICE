package TwoDimentional;
import java.util.*;

public class Shell {

    public static void rotateShell(int matrix[][],int sn,int k ){
        int rowStart = sn-1;
        int colStart = sn-1;
        int rowEnd = matrix.length-sn;
        int colEnd = matrix[0].length-sn;
        int rows = rowEnd-rowStart;
        int cols = colEnd-colStart;
        int size = 2*(rows+cols-2);
        int shellArr[] = new int[size];
        int j=0;
        for(int i=0;i<=rows;i++){
            for(int r=rowStart;r<rowEnd;r++){
                shellArr[j] = matrix[rowStart][r];
                j++;
            }
            j++;
            rowStart++;
            for(int d=rowStart;d<=rowEnd;d++){
                shellArr[j] = matrix[d][colEnd-1];
                j++;
            }
            j++;
            colEnd--;
            for(int l=colEnd-1;l>=colStart;l--){
                shellArr[j] = matrix[rowEnd-1][l];
                j++;
            }
            rowEnd--;
            for(int u=rowEnd-1;u>=rowStart;u--){
                shellArr[j] = matrix[u][colStart];
                j++;
            }
            

        }
        System.out.println(shellArr.toString());
        
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

        System.out.println("select shell to rotate:");
        int sn = sc.nextInt();
        System.out.println("select number of rotations:");
        int k = sc.nextInt();
        
        rotateShell(arr,sn,k);
    }
}
