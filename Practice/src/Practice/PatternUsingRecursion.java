package Practice;
import java.util.*;
public class PatternUsingRecursion {
	public static void generateSubsets(int ind,int[] set,ArrayList<Integer> subset){
		
		
		if(ind>=set.length) {
			System.out.print(subset);
			return;
		}
		subset.add(set[ind]);
		generateSubsets(ind+1,set,subset);
		
		subset.remove(subset.size()-1);
		generateSubsets(ind+1,set,subset);
		
		
		
		
		
		
		
	}
	public static void main(String args[]) {
		int[] set = {3,1,2};
		generateSubsets(0,set,new ArrayList<>());
	}
}
