package Practice;
import java.util.*;
public class PowerSet {
	public static ArrayList<String> generateSets(String str){
		ArrayList<String> result = new ArrayList();
		int n=str.length();
		for(int num=0;num<(1<<n);num++) {
			StringBuilder subset = new StringBuilder();
			for(int i=0;i<n;i++) {
				if((num&(1<<i))>0) {
					subset.append(str.charAt(i));
				}
				
			}
			result.add(subset.toString());
			
		}
		return result;
		
		
	}
	public static void main(String args[]) {
		String str = "abc";
		ArrayList<String> list = generateSets(str);
		System.out.print(list);
	}
}
