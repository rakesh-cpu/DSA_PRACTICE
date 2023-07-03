package TwoDimentional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static ArrayList<Integer> shuffle(ArrayList<Integer> arr) {
        Random random = new Random();
        ArrayList<Integer> shuffledArray = new ArrayList<>(arr); // Create a copy of the original array
        int size = arr.size();
        while (size > 1) {
            size--;
            int idx = random.nextInt(size + 1);
            int temp = shuffledArray.get(idx);
            shuffledArray.set(idx, shuffledArray.get(size));
            shuffledArray.set(size, temp);
        }
        return shuffledArray;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
        ArrayList<Integer> shuffled = shuffle(list);
        for (int i = 0; i < shuffled.size(); i++) {
            if (i % n == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(shuffled.get(i) + " ");
        }
        System.out.println();
    }
}

// import java.util.*;

// public class Test{
//     public static ArrayList<Integer> shuffle(ArrayList<Integer> arr){
//         Random random = new Random();
//         ArrayList<Integer> shuffledArray = new ArrayList<>();
//         while(arr.size()>0){
//             int idx = random.nextInt(arr.size());
//             int element = shuffledArray.get(idx);
//             shuffledArray.set(idx,element);
//             arr.remove(element);
//         }
        
        
//         return shuffledArray;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         System.out.println("enter array elements:");
//         arr=Arrays.stream(arr).map(i->sc.nextInt()).toArray();
//         ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
//         ArrayList<Integer> shuffled = new ArrayList(shuffle(list));
//         for(int i=0;i<shuffled.size();i++){
//            if(i%n==0){
//             System.out.println();
//            } 
//            System.out.println(shuffled.get(i));
           
//         }

        
//     }
// }

