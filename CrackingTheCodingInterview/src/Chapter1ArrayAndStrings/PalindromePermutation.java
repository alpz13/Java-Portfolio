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
public class PalindromePermutation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(isPermutationOfPalindrome(input));
    }
    
    public static boolean isPermutationOfPalindrome(String input){
        int table[] = buildCharFrequencyTable(input);
        return CheckMaxOneOdd(table);
    }
    
    public static boolean CheckMaxOneOdd(int table[]){
        boolean foundOdd = false;
        for(int count : table){
            if(count % 2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
    
    public static int[] buildCharFrequencyTable(String phrase){
        int table[] = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
            }
        }
        return table;
    }
    
    public static int getCharNumber(char c){
        int val = Character.getNumericValue(c);
        if(Character.getNumericValue('a') <= val && val <= Character.getNumericValue('z')){
            return val - Character.getNumericValue('a');
        } else if(Character.getNumericValue('A') <= val && val <= Character.getNumericValue('Z')){
            return val - Character.getNumericValue('A');
        }
        return -1;
    }
}
