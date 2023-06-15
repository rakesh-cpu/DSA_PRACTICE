package Day1;
import java.util.*;
class LongestParenthesis{
    public static int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<Character>();
        
        int count=0;
        st.push('#');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }
            if(st.peek()=='('){
                if(s.charAt(i)==')'){
                    st.pop();
                    count+=2;
                }
            }
            
        }
        if(st.peek()=='('){
            
        }
        
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = longestValidParentheses(str);
        System.out.println(result);

        sc.close();
    }
    
}