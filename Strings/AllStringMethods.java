package Strings;

import java.lang.reflect.Method;
import java.util.Scanner;

public class AllStringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "rakesh dontula";
        String Word = "Hello";
        String Frame = "Good Evening Everyone, This is rakesh dontula.";

        // methods

        // lets begins with length() methods which returns length of the String
        int length = name.length();
        System.out.println(length);

        // 2.charAt() method : returns character of the String at specified index
        char ch = name.charAt(2);
        System.out.println(ch);

        // 3.substring(start,end) : returns substring of the with specified range
        String sub = name.substring(0,6);
        System.out.println(sub);

        // 4.indexOf(character): return index of the specified character in the string 
        int ind = Word.indexOf("ell");
        System.out.println(ind);

        // 5 toLowerCase() :
        System.out.println(name.toLowerCase());

        // 6.toUpperCase() :
        System.out.println(name.toUpperCase());

        // 7.replace() :
        String afterRep = Frame.replace("Evening", "Morning");
        System.out.println(afterRep);

        // 8.split() Method in java
        String[] arr = Frame.split(",");
        System.out.println(arr);

        






        sc.close();
    }

}
