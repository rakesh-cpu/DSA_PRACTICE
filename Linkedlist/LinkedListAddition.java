package Linkedlist;
import java.util.List;
import java.util.Stack;

import Linkedlist.Linkedlist;
public class LinkedListAddition {
    
    public static Linkedlist linkedListAddition(Linkedlist l1,Linkedlist l2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1!=null){
            s1.push(l1.data);
            l1 = l1.next;

        }
        while(l2!=null){
            s2.push(l2.data);
            l2 = l2.next;
        }
        int sum=0,digit=0;
        int carry=0;
        Linkedlist res = null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int digit1 = !s1.isEmpty() ? s1.pop() : 0 ;
            int digit2 = !s2.isEmpty() ? s2.pop() : 0 ;

            sum = digit1+digit2+carry;
            digit = sum%10;
            carry = sum/10;

            Linkedlist newList = new Linkedlist();
            newList.addFirst(digit);


            newList.next = res;


        }


        return res;
    }
    public static void main(String[] args) {
        Linkedlist list1 = new Linkedlist();
        Linkedlist list2 = new Linkedlist();
        list1.addLast(7);
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(3);

        list1.displayList();

        list2.addFirst(4);
        list2.addFirst(6);
        list2.addFirst(5);
        list2.displayList();
        Linkedlist list3 = linkedListAddition(list1,list2);
        list3.displayList();

        

    }
}
