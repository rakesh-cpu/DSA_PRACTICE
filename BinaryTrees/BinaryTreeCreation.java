package BinaryTrees;

import java.util.Stack;



public class BinaryTreeCreation {
    public static class Node{
        int data;
        Node left;
        Node right;
            Node(int data,Node left,Node right){
                this.data = data;
                this.left = left;
                this.right = right;

            }
    }
    public static class Pair{
        Node node;
        int state;
            Pair(Node node,int state){
                this.node = node;
                this.state = state;
            }
    }
    public static void Inorderdisplay(Node root){
        if(root==null){
            return;
        }
        String  str = " ";
        str+= root.left == null ? "." : root.left.data+" ";
        str+="<-"+root.data+"->";
        str+=root.right == null ? " ." : root.right.data+" ";
        System.out.println(str);
        Inorderdisplay(root.left);
        Inorderdisplay(root.right);
    }
    public static void postOrderDisplay(Node root){
        if(root==null){
            return;
        }
        postOrderDisplay(root.left);
        postOrderDisplay(root.right);
        String  str = " ";
        str+= root.left == null ? "." : root.left.data+" ";
        str+="<-"+root.data+"->";
        str+=root.right == null ? " ." : root.right.data+" ";
        System.out.println(str);
    }
    public static void preOrderDisplay(Node root){
        if(root==null){
            return;
        }
        preOrderDisplay(root.left);
        String  str = " ";
        str+= root.left == null ? "." : root.left.data+" ";
        str+="<-"+root.data+"->";
        str+=root.right == null ? " ." : root.right.data+" ";
        System.out.println(str);
        preOrderDisplay(root.right);
    }
    public static void main(String[] args) {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();

        st.push(rtp);
        int idx = 0;
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state==1){
                idx++;
                if(arr[idx]!=null){
                top.node.left = new Node(arr[idx], null, null);
                Pair lp = new Pair(top.node.left, 1);
                st.push(lp);
                }
                else{
                    top.node.left = null;
                }
                top.state++;


            }
            else if(top.state==2){
                idx++;
                if(arr[idx]!=null){
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
                else{
                    top.node.right=null;
                }
                top.state++;

            }
            else{
                st.pop();
            }
        }
        Inorderdisplay(root);
        preOrderDisplay(root);
        postOrderDisplay(root);

    }
}
