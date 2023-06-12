public class PossibleSquare {
    public static void main(String[] args) {
        int n=2,sqr=64;
        int result = 1;
        int count=0;
        while(result!=sqr){
             result*=n;
             count++; 
        }
        System.out.println(sqr+" "+n+"power "+count);
    }
}
