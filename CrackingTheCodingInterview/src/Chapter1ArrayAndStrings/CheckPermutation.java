/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1ArrayAndStrings;

import java.util.*;

/**
 *
 * @author alex
 */
public class CheckPermutation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String first =  in.nextLine();
        String second = in.nextLine();
        System.out.println(permutation(first, second));
    }
    
    public static String Sort(String input){
        char[] content = input.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    
    public static boolean permutation (String a, String b){
        if(a.length() != b.length()){
            return false;
        }
       return Sort(a).equals(Sort(b));
    }
    
    
    //O(n) iterates through the string once. Assuming that A and B are the same length it would be O(A+B) making it O(n)
    public static boolean permutationV2(String a, String b) {
    	
    	if(a.length() != b.length()) {
    		return false;
    	}
    	
    	int[] letters = new int[128];
    	
    	char[] a_array = a.toCharArray();
    	for(char c: a_array) {
    		letters[c]++;
    	}
    	
    	for(int i = 0; i < b.length(); i++) {
    		int index = (int) b.charAt(i);
    		letters[index]--;
    		if(letters[index] < 0) {
    			return false;
    		}
    	}
    	return true;
    }
    
}
