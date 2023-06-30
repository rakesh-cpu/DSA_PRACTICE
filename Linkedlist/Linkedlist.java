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
    static Node head;
    static Node tail;
    static int size = 0;
    // adding element to the linkedlist at the beginning
    public static void addFirst(int data){
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
    public static void addLast(int data){
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
    public static void insert(int data,int pos){
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
    public static void removeFirst(){
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
    public static void removeLast(){
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
    public static void remove(int data){

    }
    public static void display(){
        Node temp = head;
        if(head==null){
            System.out.println("nothing to print list is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }
    private static Node getNode(int pos){
         Node temp = head;
         for(int i=0;i<pos;i++){
            temp = temp.next;
         }
         return temp;
    }
    public static void reverseItr(){
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
    public static void reversePtr(){
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
    public static int kthFromLast(int k){
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

    public static void main(String[] args) {
        addFirst(30);
        addFirst(20);
        addFirst(10);
        addLast(40);
        insert(25,4);
        // removeFirst();
        // removeLast();
        // display();
        // reverseItr();
        System.out.println();
        // display();
        // reversePtr();
        display();
        System.out.println();
        System.out.println(kthFromLast(8));
    }
}
