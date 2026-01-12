package NumberProblems;
import java.util.*;
public class PrimeNumeber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num=s.nextInt();
		int count=0;
		for(int i=2;i<=num;i++) {
			if(i%2==0) 
				
			count++;
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
		
	}

}
