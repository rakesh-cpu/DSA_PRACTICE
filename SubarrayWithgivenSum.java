import java.util.*;
public class SubarrayWithgivenSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> res = subarraySum(arr,n,s);
            for(int i=0;i<res.size();i++){
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int left=0,right=0;
        int sum=0;
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(right<n){
            sum+=arr[right];
            if(sum==s){
                a.add(left+1);
                a.add(right+1);
                return a;
            }
            if(sum>s){
                while(sum>s){
                    sum-=arr[left];
                    left++;
                }
                if(sum==s){
                    a.add(left+1);
                    a.add(right+1);
                    return a;
                }
            }
            right++;
        }
        
        // int i=1,j=0;
        // while(i<n){
        //     sum+=arr[j];
        //     j++;
        //     i++;
        //     if(sum==s){
        //         ptr2=i;
        //         a.add(ptr1);
        //         a.add(ptr2);
        //         return a;
        //     }
        //     if(sum>s){
        //         ptr1=i-1;
        //         sum-=arr[ptr1];
        //         ptr1++;
                
        //     }
        // }
        
        ArrayList<Integer> res = new ArrayList();
        res.add(-1);
        return res;
        
    }
}
