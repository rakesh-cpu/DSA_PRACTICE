import java.util.Arrays;

public class ArraysMethods{
    public static void main(String[] args) {
    //    static intialization of array
        int a[] = {2,3,4,5,6};

        int[] b = new int[]{2,3};
        int[] c = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        String arr[] = new String[]{
            "rama","sita"
        };
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(a, 5));
        // Arrays.fill(a, 1);
        System.out.println(Arrays.toString(a));
        boolean check = Arrays.asList(a).contains(2);
        Arrays.parallelPrefix(a,(x,y)->x+y);
        System.out.print(Arrays.toString(a));


    }
}