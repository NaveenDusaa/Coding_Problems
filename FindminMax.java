package ArrayProblems;
//Find Array min and max
public class FindminMax {
	public static void main(String args[]){
		int[] arr= {10,20,80,100};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("array max is "+max);
		System.out.println("array min is "+min);
		
		
		
	}
}
