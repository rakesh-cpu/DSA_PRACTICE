package Practice;
import java.util.*;

public class duplicateBrackates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("stack program1");
		Stack<Character> st = new Stack<Character>();
//		st.push('(');
		String str = "((a+b)*((a-b)))";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==')') {
				
				
				while(!st.isEmpty() && st.peek()!='(') {
					st.pop();
				}
				st.pop();
			
			}
			else {
				st.push(ch);
			}
		}
		if(st.isEmpty()) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False:");
		}
	}

}
