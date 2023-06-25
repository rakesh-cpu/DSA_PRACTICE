package TwoDimentional;

public class RotateArrayKtimes {
    
        public static int[] rotate(int arr[],int r){
            r = r%arr.length;
            if(r<1){
                r = r+arr.length;
            }
            int len = arr.length;
            reverse(arr,0,len-r-1);
            reverse(arr,len-r,len-1);
            reverse(arr,0,len-1);
          return arr;  
            
        }
        public static void reverse(int arr[],int l,int r){
            int li = l;
            int ri = r;
            while(li<ri){
                int temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;

                li++;
                ri--;
            }
            
        }
        public static void main(String args[]){
            int arr[] = {1,2,3,4,5,6,7,8,9};
            for(int i:arr){
                System.out.print(i+" ");
            }
            int rArr[]=rotate(arr,3);
            System.out.println("after rotattion:");
            for(int i:rArr){
                System.out.print(i+" ");
            }
            
            
        }
    
}
