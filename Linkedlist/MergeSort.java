package Linkedlist;
import Linkedlist.*;

public class MergeSort {
    public Linkedlist mergeLinkedlists(Linkedlist one, Linkedlist two) {
        Node l1 = one.getHead();
        Node l2 = two.getTail();
        Linkedlist res = new Linkedlist();

        // Your merge logic goes here
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                res.addLast(l1.data);
                l1 = l1.next;
            } else {
                res.addLast(l2.data);
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            res.addLast(l1.data);
            l1 = l1.next;
        }
        while (l2 != null) {
            res.addLast(l2.data);
            l2 = l2.next;
        }

        return res;
    }

    public static Node midNode(Node head,Node tail){
        Node f = head;
        Node s = head;
        while(f!=tail && f.next!=tail){
            f = f.next.next;
            s = s.next;

        }
        return s;
    }
    public  Linkedlist merge(Node head,Node tail){
        mergeSortOnLinkedlist m = new mergeSortOnLinkedlist();
        if(head==tail){
            Linkedlist bl = new Linkedlist();
            bl.addLast(head.data);
            return bl;
        }
        Node mid = midNode(head,tail);
        Linkedlist fsl = merge(head,mid);
        Linkedlist ssl = merge(mid.next,tail);
        Linkedlist sortedList = m.mergeLinkedlists(fsl, ssl);

        return sortedList;
        // return head.data;



    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addLast(12);
        list.addLast(2);
        list.addLast(10);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(3);

        list.displayList();
        Node h = list.getHead();
        Node t = list.getTail();
        System.out.println(h.data);
        System.out.println(t.data);
        MergeSort ms = new MergeSort();
        Linkedlist SortedLinkedList=ms.merge(h,t);
        SortedLinkedList.displayList();
        // SortedLinkedList.displayList();



    }
}
