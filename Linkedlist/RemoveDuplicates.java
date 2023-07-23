package Linkedlist;
import Linkedlist.*;

public class RemoveDuplicates {
    public Linkedlist removeDuplicates(Linkedlist list){
        Linkedlist setLinkedlist = new Linkedlist();
        Node temp = list.head;
        
        setLinkedlist.addLast(temp.data);
        Node tail = setLinkedlist.getTail();
        while(temp!=null){
            int data = temp.data;
            if(tail.data!=data){
                setLinkedlist.addLast(data);
                tail = tail.next;
            }
            temp = temp.next;
            
            
        }

        return setLinkedlist;
    


    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addLast(2);
        list.addLast(2);
        list.addLast(10);
        list.addLast(10);
        list.addLast(10);
        list.addLast(20);
        list.addLast(40);
        list.addLast(40);
        list.addLast(40);
        list.addLast(40);
        list.addLast(40);
        
        MergeSort m = new MergeSort();
        RemoveDuplicates rm = new RemoveDuplicates();
        // Node h = list.getHead();
        // Node t = list.getTail();
        // m.merge(h,t).displayList();
        rm.removeDuplicates(list).displayList();
        
        

    }
}
