package NumberProblems;
//program to armstrong number
public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int rev=0;
		while(num>0) {
			int r=num%10;
			System.out.println(r);
			rev +=r*r*r;
			System.out.println(rev);
			num =num/10;
		}
		if(temp==rev) {
			System.out.println("armstorng");
		}
		else {
			System.out.println("not armstorng");
		}
		
	}

}
