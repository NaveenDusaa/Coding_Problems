package StringProblems;
//coutn character frequency
public class CountCharacterFrequency {
	
	public static void frequency(String s) {
		int[] freq=new int[256];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			freq[c]++;
		}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(freq[c] !=0) {
				System.out.println(c +"->"+freq[c]);
				freq[c]=0;
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		CountCharacterFrequency.frequency("apple");
		
	}

}
