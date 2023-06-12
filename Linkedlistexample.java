class Linkedlistexample {
    static node head;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;

        }

    }
    public static void addFirst(int value){
        node newnode = new node(value);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next = head;
        head = newnode;


    }
    public static void addLast(int value){
        node newnode = new node(value);
        if(head==null){
            head = newnode;
            return;
        }
        node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    public void printList(){
        if(head==null){
            System.out.println("no list found");
            return;
        }
        node temp = head;
        while(temp!=null){
            if(temp.next!=null){
            System.out.print(temp.data+"->");
            }
            else{
                System.out.println(temp.data+" ");
            }
            temp = temp.next;

        }
    }
    public static void reverseList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            System.out.println(head.data+" ");
        }
       node prev = head;
       node current = head.next;
       while(current!=null){
        node nextnode = current.next;
        current.next = prev;

        prev = current;
        current = nextnode;

       }
       head.next = null;
       head = prev;

        
    }
    public static void main(String args[]){
        Linkedlistexample list = new Linkedlistexample();
        
        addFirst(40);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        addLast(50);
        list.printList();
        reverseList();
        list.printList();



    }
}
