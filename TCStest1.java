import java.util.*;

public class TCStest1{
    
    public static int findAbsolute(int[][] arr){
        int leftdiagnolsum =0;
        int rightdiagnolsum = 0;
        
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            leftdiagnolsum = leftdiagnolsum+arr[i][i];
            rightdiagnolsum  = rightdiagnolsum+arr[i][n-i-1];    
        }
        int absoluteSum = leftdiagnolsum - rightdiagnolsum;
        return absoluteSum;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the dimensions of the array
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = input.nextInt();

        // Create the array with the given dimensions
        int[][] myArray = new int[numRows][numCols];

        // Use nested loops to fill in the values of the array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter the value for element (" + i + "," + j + "): ");
                int value = input.nextInt();
                myArray[i][j] = value;
            }
        }

        // Print the final array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    System.out.println("the absolute sum is:"+findAbsolute(myArray));
    }
}
