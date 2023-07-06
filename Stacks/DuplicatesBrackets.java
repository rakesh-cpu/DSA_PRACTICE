package Stacks;
import java.util.*;

public class DuplicatesBrackets {
    public static boolean hasDuplicateBrackets(String str){
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println("has duplicates brackets");
                    return true;

                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }

            }
            else{
                st.push(ch);
            }
        }
        
        
        
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Expression:");
        String str = sc.next();
        System.out.println(hasDuplicateBrackets(str));
        
    }
}
