package StringProblems;

public class FirstNonRepetingCharacter {
	public static void main(String[] args) {
		String str="swiss";
		
		int[] freq=new int[256];
		//count frequency
		for(char c:str.toCharArray()) {
			freq[c]++;
		}
		//first non repeting character
		for(char c:str.toCharArray()) {
			if(freq[c]==1) {
				System.out.println(c);
				return ;
			}
		}
	}

}
