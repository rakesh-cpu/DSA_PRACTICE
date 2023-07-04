package Linkedlist;

class Node{
    int data;
    Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
}
public class Linkedlist {
    public Node head;
    public Node tail;
    public Node rleft;
    public int size = 0;
     public Node getHead(){
        return head;
     }
     public Node getTail(){
        return tail;
     }
     public Node rleft(){
        return rleft;
     }
    // adding element to the linkedlist at the beginning
    public void addFirst(int data){
        Node node  = new Node(data,null);
        if(head==null){
            head = node;
            tail = node;
            }
        else{
        node.next = head;
        head = node;
        }
        size++;
    }
    // adding element to the linkedlist at the end
    public void addLast(int data){
        Node node = new Node(data,null);
        if(head==null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;


    }
    public void insert(int data,int pos){
        Node node  = new Node(data, null);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        if(pos<=0){
            node.next = head;
            head = node;
        }
        else{
           Node current = head;
           int currentPos = 0;
           while(current!=null && currentPos < pos-1){
            current = current.next;
            currentPos++;
           }
           if(current!=null){
              node.next = current.next;
              current.next = node;

           }
           else if(current == tail){
            current.next = node;
            node = tail;
           }
           else{
            System.out.println("out of index:");
           }
        }
    }
    // removing element from the linkedlist
    public  void removeFirst(){
        if(head==null){
            System.out.println("nothing to remove:");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            
        }
        head = head.next;
    
        size--;
    }
    public  void removeLast(){
        if(head==tail){
            tail = null;
            head = null;
        }
        if(head==null){
            System.out.println("nothing to remove:");
        }
        Node current = head;
        Node prev = null;

        
        while(current.next!=null){
            prev = current;
            current = current.next;
        }
        prev.next= null;
        tail = prev;

    }
    public  int size(Node head){
        Node temp = head;
        int size1 = 0;
        while(temp!=null){
            temp = temp.next;
            size1++;
        }
        return size1;
    }
    public static void remove(int data){

    }
    public void displayList(){
        Node temp = head;
        if(head==null){
            System.out.println("nothing to print list is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();

    }
    public  Node getNode(int pos){
         Node temp = head;
         for(int i=0;i<pos;i++){
            temp = temp.next;
         }
         return temp;
    }
    public void reverseItr(){
        int li=0;
        int ri = size-1;
        while(li<ri){
         Node left = getNode(li);
         Node right = getNode(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;

        } 

    }
    public  void reversePtr(){
        Node prev = null;
        Node curr = head;
        
        while(curr!=null){
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }
    public  int kthFromLast(int k){
        Node s = head ;
        Node f = head ;
        if (head == null) {
            // Handle empty linked list
            throw new RuntimeException("Linked list is empty");
        }
        if (k <= 0) {
            // Handle invalid index
            throw new IllegalArgumentException("Invalid index");
        }
        for(int i=0;i<k;i++){
            if (f == null) {
                // Handle case where k exceeds the length of the linked list
                throw new IllegalArgumentException("Invalid index");
            }
            f = f.next;
        }
        while(f!=tail && f.next!=null){
            s = s.next;
            f = f.next;

        }
        return s.data;

    }
    public  int mid(){
        Node s = head;
        Node f = head;
        while(f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        
        return s.data;
    }
    public void printReverseRec(Node temp){
        if(temp==null){
            return;
        }
    
        printReverseRec(temp.next);
        System.out.print(temp.data+" ");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        // insert(25,4);
        // removeFirst();
        // removeLast();
        // display();
        // reverseItr();
        System.out.println();
        // display();
        // reversePtr();
        list.displayList();
        System.out.println();
        // System.out.println(kthFromLast(8));
        // System.out.println(mid());
        Node temp = list.getHead();
        list.printReverseRec(temp);
    }
}
