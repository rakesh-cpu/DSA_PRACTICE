package recursion;

public class Zigzag{
    public static void printzigzag(int n){
        if(n==0){
            return ;
        }
        System.out.println("pre->"+n);
        printzigzag(n-1);
        System.out.println("in->"+n);
        printzigzag(n-1);
        System.out.println("post->"+n);
    


    }
    public static void main(String[] args) {
        int n = 3;
         printzigzag(n);
        

    }
}
