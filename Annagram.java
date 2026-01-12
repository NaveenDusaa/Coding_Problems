package StringProblems;

import java.util.Arrays;

public class Annagram {
	
	public static void main(String[] args) {
		//step 1:convert to the character array
		//step 2:sort the array
		//step 3:compaire the method
		
		String s1="listen";
		String s2="silent";
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("anogram");
		}
		else {
			System.out.println("not anogram");
		}
	}

}
