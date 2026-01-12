package ArrayProblems;

public class EvenOrOdd {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("even "+arr[i]);
			}
			else {
				System.out.println("odd "+arr[i]);
			}
		}
		
		int[] a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}

}
