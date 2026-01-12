package ArrayProblems;

public class SecondElement {
	public static void main(String[] args) {
		int[] arr= {10,50,80,70,100};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>secondLargest && arr[i] !=largest) {
				secondLargest=arr[i];
			}
		}

		System.out.println(secondLargest);
	}

}
