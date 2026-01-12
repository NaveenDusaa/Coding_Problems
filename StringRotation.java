package StringProblems;

public class StringRotation {
	
	public static String Rotation(String s1,String s2) {
		String temp=s1+s2;
		if(temp.contains(s2)) {
			System.out.println("rotation");
		}
		else {
			System.out.println("not rotation");
		}
	return temp;
	}
	public static void main(String[] args) {
		
		StringRotation.Rotation("abcd"," cdab");
//		String s1="abcd";
//		String s2="cdab";
//		
//		String temp=s1+s2;
//		if(temp.contains(s2)) {
//			System.out.println("rotation");
//		}
//		else {
//			System.out.println("not rotation");
//		}
		
	}

}
