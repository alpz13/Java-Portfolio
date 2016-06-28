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
public class StringCompression {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(Compress(input));
    }
    
    public static String Compress(String input){
        StringBuilder compress = new StringBuilder();
        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            counter++;
            if(i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)){
                compress.append(input.charAt(i));
                compress.append(counter);
                counter = 0;
            }
        }
        if(compress.length() < input.length()){
            return compress.toString();
        } else {
            return input;
        }  
    }
    
}
