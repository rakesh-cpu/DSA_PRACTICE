package Linkedlist;

import Linkedlist.Linkedlist;
import Linkedlist.Node;


public class mergeSortOnLinkedlist {
    public Linkedlist mergeLinkedlists(Linkedlist one, Linkedlist two) {
        Node l1 = one.head;
        Node l2 = two.head;
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

    public static void main(String[] args) {
        Linkedlist one = new Linkedlist();

        one.addLast(1);
        one.addLast(3);
        one.addLast(7);
        one.addLast(10);
        one.displayList();

        Linkedlist two = new Linkedlist();

        two.addLast(2);
        two.addLast(6);
        two.addLast(8);
        two.addLast(9);
        two.addLast(12);
        two.displayList();

        mergeSortOnLinkedlist m = new mergeSortOnLinkedlist();

        Linkedlist result = m.mergeLinkedlists(one, two);
        result.displayList();
    }
}
