package ArrayProblems;

//Program to reverse Array
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int n=arr.length;
		int[] rev=new int[n];
		for(int i=0;i<n;i++) {
			rev[i]=arr[n-i-1];
		}
		for(int num:rev) {
			System.out.println(num);
		}
		
		//method 2 using list collection
		
		Integer[] a= {10,20,30};
		List<Integer> list=Arrays.asList(a);
		Collections.reverse(list);
		System.out.println(list);
	}

}
