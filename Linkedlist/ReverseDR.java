package Linkedlist;
import Linkedlist.Linkedlist;
public class ReverseDR {
    
    public static  void reverseHelper(Node right,int floor,int size){
        if(right==null){
            return;
        }
        reverseHelper(right.next, floor+1,size);
        if(floor>=size/2){

            int temp = right.data;
            right.data = rleft.data;
            rleft.data = temp;

            rleft=rleft.next;

        }
    }
    
    static Node rleft;
    static Node pleft;
    public void reverse(Node head,int size){
        reverseHelper(head,0,size);
    }
    public static boolean isPalindrome(Node right){
        if(right==null){
            return true;
        }
        boolean rres = isPalindrome(right.next);
        if(rres==false){
            return false;
        }
        else if(pleft.data!=right.data){
            return false ;
        }
        else{
            pleft=pleft.next;
            return true;
        }
    }

    public boolean PalindromeCheck(Node head){
        pleft = head;
        return isPalindrome(head);
    }



    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);
        Node h=list.getHead();
        rleft=h;
        int size = list.size(h);
        list.displayList();
        ReverseDR rd = new ReverseDR();
        rd.reverse(h,size);
        list.displayList();
        System.out.println(rd.PalindromeCheck(h));
        
    }
}
