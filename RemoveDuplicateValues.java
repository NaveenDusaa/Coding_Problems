package ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateValues {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,4};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			set.add(num);
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}
