import java.util.HashMap;
public class FirstElementktimes {
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int count = map.get(a[i]);
                map.put(a[i],count+1);
            }
            else{
                map.put(a[i],1);
            }
                
            if(map.get(a[i])==k){
                    return i;
            }
            
            
        }
        return -1;
}
    public static void main(String[] args) {
        FirstElementktimes f = new FirstElementktimes();
        int[] a = {4,2,2,2,3,4,4,4,3,2};
        int n = a.length;
        int k = 3;
        System.out.println(f.firstElementKTime(a, n, k));
    }
}
