package NumberProblems;
//program to reverse a number
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=s.nextInt();
//		
//		int num=12345;
		int rev=0;
		
		while(num>0) {
			int digit=num%10; //1
			rev=rev*10+digit; //5
			num =num/10;
			
		}
		System.out.println(rev);
	}

}
