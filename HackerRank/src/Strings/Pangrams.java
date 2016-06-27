/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.*;

/**
 *
 * @author alex
 */
public class Pangrams {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int alphabet[] = new int[26];
        Arrays.fill(alphabet,0);
        String input = in.nextLine();        
        Pangram(input,alphabet);
        if(Compare(alphabet)){
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        } 
    }
    
    public static void Pangram(String input, int alphabet[]){
        
        for(int i = 0; i < input.length();i++){       
            if(input.charAt(i) >= 65 && input.charAt(i) <= 90){
                alphabet[input.charAt(i) - 65] = 1;
            } else if(input.charAt(i) >= 97 && input.charAt(i) <= 122){
                alphabet[input.charAt(i) - 97] = 1;
            } 
        }    
    }
    
    public static Boolean Compare(int alphabet[]){
        
        for(int j = 0; j < alphabet.length; j++){
                if(alphabet[j] !=1){
                    return false;
                }
        }
        return true;
    }
    
    
    
    
    
}
