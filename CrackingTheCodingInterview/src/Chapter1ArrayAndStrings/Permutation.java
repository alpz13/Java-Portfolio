package Chapter1ArrayAndStrings;

import java.util.Scanner;

public class Permutation {

	
	   public static void main(String[] args){
	        //System.out.println(permutation(first, second));
	        permutation("abad");
	        
	    }
	   
	   private static void permutation(String str) {
		  permutationImpl(str, "");
	   }
	   
	   private static void permutationImpl(String str, String prefix) {
		   if(str.length() == 0) {
			   System.out.println(prefix);
		   } else {
			   for(int i = 0; i < str.length(); i++) {
				   String rem = str.substring(0, i) + str.substring(i+1);
				   permutationImpl(rem, prefix + str.charAt(i));
			   }
		   }
	   }
}
