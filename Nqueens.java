public class Nqueens {
    public static boolean isQsafe(int arr[][],int row,int col){
        for(int i = row-1,j=col;i>=0;i--){
            if(arr[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(arr[i][j]==1){
                return false;

            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;

    }

    public static void printArray(int arr[][],String qp,int row,int count){
        
        if(row==arr.length){
            count++;
            System.out.println(qp);
            
            
            return;
        }
        for(int col=0;col<arr.length;col++){
            if(isQsafe(arr,row,col) == true){    
            arr[row][col] = 1; 
            count++;
            printArray(arr,qp+row+"-"+col+"  ",row+1,count);
            count--;
            arr[row][col] = 0;
        }
       }
    }
    public static void main(String[] args) {
        int n = 4;
        
        int[][] chess = new int[n][n];
        int count=0;
        printArray(chess," ",0,count);
    
    }
}
