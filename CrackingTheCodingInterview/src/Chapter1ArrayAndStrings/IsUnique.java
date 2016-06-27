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
public class IsUnique {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(isUnique(input));
    }
    
    
    /*
      you can modify isUnique() method to compare 8bits of the string since
      strings are made only of 8 bit segments and compare them.
    */
    public static Boolean isUnique(String input){
        if(input.length() > 128){
            return false;
        }
        boolean[] sets = new boolean[128];
        for(int i = 0; i < input.length(); i++){
            int val = input.charAt(i);
            if(sets[val]){
                return false;
            }
            sets[val] = true;
        }
        return true;
    }
    
}
