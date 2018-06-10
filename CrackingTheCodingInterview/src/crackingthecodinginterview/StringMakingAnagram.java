package crackingthecodinginterview;

public class StringMakingAnagram {

	public static void main(String[] args) {
		
		String a = "cdefhyia";
		String b = "abcfhyie";
		System.out.println(numberNeeded2(a,b));
	}
	
	//brute force.... iuckk.. didnt want it that way
	public static int numberNeeded2(String a, String b) {
		// not sure if 26 according to alphabet
		int[] frq1 = new int[26];
		int[] frq2 = new int[26];
		int res = 0;
		
		//Upper to lower case might be needed
		for(int i = 0 ; i < a.length() ; i++) {
			frq1[a.charAt(i) - 'a']++;
		}
		for(int i = 0 ; i < b.length() ; i++) {
			frq2[b.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			res += Math.abs(frq1[i] - frq2[i]);
		}
		return res;
		
		
	}
	
	//didn't pass all tests... hmmmm
	public static int numberNeeded(String first, String second) {

	    StringBuilder firstBuilder = new StringBuilder(first);
	    StringBuilder secondBuilder = new StringBuilder(second);
	    int numberNeeded = firstBuilder.length() + secondBuilder.length();

	    for (int i=0; i<first.length(); i++) {

	        char currentChar = first.charAt(i);

	        for (int j=0; j<secondBuilder.length(); j++) {
	            char charToCompare = secondBuilder.charAt(j);

	            if (charToCompare == currentChar) {
	                firstBuilder.deleteCharAt(0);
	                secondBuilder.deleteCharAt(j);
	                numberNeeded -= 2;
	                break;
	            }
	        }
	    }

	    return numberNeeded;
	}
}
