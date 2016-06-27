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
    
}
