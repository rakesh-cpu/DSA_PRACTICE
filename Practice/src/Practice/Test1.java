package Practice;
public class Test1 {

	public static void main(String[] args) {
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code onlin
		        String s = "welcometojava";
		        String small = s.substring(0,3);
		        // System.out.println(small);
		        String large = s.substring(0,3);
		        // System.out.println(sum);
		        for(int i=0;i<s.length()-2;i++){
		            String sum = Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1))+Character.toString(s.charAt(i+2));
		            int j = small.compareTo(sum);
		            // System.out.println(j);
		            if(small.compareTo(sum)>0){
		                small = sum;
		            
		            }
		            if(sum.compareTo(large)>0){
		                large = sum;
		            }
		                // System.out.println(sum);
		            
		            
		        }
		        System.out.println(small);
		        System.out.println(large);
		    }
		}

	}

}
