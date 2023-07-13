package Stacks;

public class MaxInSubArray {
    
        public static void main(String args[]){
            int arr[] = {1,2,3,4,2,4,5,34,2,3,21,4,5,6,43,3,2,5,6,78,653,432};
            int mAlen =(int) (arr.length/4)+1;
            int mxlenArr[] = new int[mAlen];
            int idx=0;
            for(int i=0;i<arr.length;i+=4){
                int start = i;
                int max = arr[i];
                while(start<i+Math.min(4,arr.length-i)){
                    if(max<arr[start]){
                        max = arr[start];
                        
                    }
                    start++;
                    
                }
                mxlenArr[idx++] = max;
                
                
                
            }
            for(int num:mxlenArr){
                System.out.println(num);
            }
        }
    
}
