package NumberProblems;
import java.util.Scanner;
public class Palindrone {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=s.nextInt();
		int reverse=0;
		int temp=num;
		
		while(num>0) {
			int digit=num%10;
			reverse =reverse*10+digit;
			num =num/10;
			
		}
		if(reverse==temp) {
			System.out.println("Palindrone");
		}
		else {
			System.out.println("not palindrone");
		}
	}

}
