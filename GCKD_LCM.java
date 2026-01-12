package NumberProblems;
import java.util.*;


		public class GCKD_LCM  {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter A");
		        
		        int a = sc.nextInt();
		         System.out.println("Enter B");
		        int b = sc.nextInt();
		        
		        int x = a;
		        int y = b;
		        
		       
		        while (y != 0) {
		            int r = x % y;
		            x = y;
		            y = r;
		        }
		        
		        int gcd = x;
		        int lcm = (a * b) / gcd;
		        
		        System.out.print(gcd + " " + lcm);
		    }
		

		
	}


