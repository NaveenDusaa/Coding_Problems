package NumberProblems;
import java.util.*;

public class FibonacciSeries {
	public static void series(int a,int b) {
		int num=10;
		for(int i=0;i<num;i++) {
			System.out.print(a+" ");
			int c=a+b;
			
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter a Number a");
//		int num=s.nextInt();
		
		FibonacciSeries.series(0, 1);
		
		
	}

}
