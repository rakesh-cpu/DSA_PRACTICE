package Day1;

import java.util.Scanner;

public class PrintAllPalindromeInString {

    public static boolean isPalindrome(String ss){

        int start=0;
        int end = ss.length()-1;
        while(start<=end){
            if(ss.charAt(end)!=ss.charAt(start)){
                return false;
            }
            start++;
            end--;
        }




        return true;
    }

    public static void palindromeSubstrings(String s){
        int max = 0;
        String maxString="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ss = s.substring(i, j);

                if(isPalindrome(ss)){
                    if(max<ss.length()){
                        max = ss.length();
                        maxString = ss;
                    }
                    System.out.println(ss);
                }
            }
        }
        System.out.println("longest palindromic String is:"+maxString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindromeSubstrings(str);
    }
}
