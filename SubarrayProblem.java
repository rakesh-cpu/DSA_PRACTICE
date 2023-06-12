import java.util.*;
public class SubarrayProblem{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,-3,2,1,-1,2,-7,-1,3,2,1,-1,0,-3,3};
        int maxSum = arr[0];
        int sum = 0;
        // int ptr1=0,ptr2=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         sum = Arrays.stream(Arrays.copyOfRange(arr,i,j+1)).reduce(0,(a,b)->a+b);
                
        //         if(maxSum<sum){
        //             maxSum=sum;
        //             ptr1=i;
        //             ptr2=j;
                    
        //         }
                
        //     }
        //         // System.out.println(maxSum);
        // }

            // using kadane's algorithm
            int ptr1=0,ptr2=0;
            for(int i=0;i<arr.length;i++){
                sum = sum+arr[i];
                if(sum>=maxSum){
                    maxSum = sum;
                    ptr2 = i;
                }
                if(sum<0){
                    sum = 0;
                    ptr1=i+1;
                    
                }
            }

        System.out.println("maximum sum of an subarray  is:"+maxSum);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,ptr1,ptr2+1)));
    }
}