package Stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

public class NextGreateElement {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        } 
        int[] nge = solve(a);
        display(nge);
    }

public static void display(int[]  a){
    StringBuilder sb= new StringBuilder();
    for(int val:a){
        sb.append(val+"\n");
    }
    System.out.println(sb);

}
public static int[] solve(int[] arr){
    int[] nge = new int[arr.length];
    Stack<Integer> st = new Stack();
    st.push(arr[arr.length-1]);
    nge[arr.length-1]=-1;
    for(int i=arr.length-2;i>=0;i--){
        while(st.size()>0 && arr[i]>=st.peek()){
            st.pop();
        }
        if(st.size()==0){
            nge[i]=-1;
        }
        else{
            nge[i] = st.peek();
        }
        st.push(arr[i]);

    }
    return nge;
    
}
}
