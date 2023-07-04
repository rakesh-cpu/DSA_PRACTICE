package TwoDimentional;


import java.util.*;

public class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter array elements:");
        for(int i=0;i<len;i++){
            list.add(sc.nextInt());
        }
        Random random = new Random();
        for(int i=0;i<len;i++){
            int idx = random.nextInt(list.size());
            if(i%n==0) System.out.println();
            System.out.print(list.get(idx)+" ");
            list.remove(list.get(idx));
        }

        
    }
    System.out.println("successful:")
}

