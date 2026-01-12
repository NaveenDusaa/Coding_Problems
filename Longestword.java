package StringProblems;

public class Longestword {
	public static void main(String[] args) {
		String str="My Name is Nagabhushanam Dusa";
		
		String[] words=str.split(" ");
		
		String longest="";
		
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
			
		}
		
		System.out.println(longest);
	}

}
