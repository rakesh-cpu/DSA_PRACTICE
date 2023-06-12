package Practice;
import java.util.*;
public class Printpatterns {
	public static void generatePatterns(int arr[],ArrayList<Integer> list,HashMap<Integer,Integer> map) {
		if(arr.length==list.size()) {
			System.out.println(list);
		}
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
					list.add(arr[i]);
				
			}
		}
		
	}
	
	public static void main(String args[]) {
			int arr[] = {1,2,3};
			HashMap<Integer,Integer> map = new HashMap();
			ArrayList<Integer> list = new ArrayList();
			int n = 6;
			generatePatterns(arr,list,map);
		}
}
