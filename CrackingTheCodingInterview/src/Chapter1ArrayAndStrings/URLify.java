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
public class URLify {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Spaces(input);
    }
    
    public static void Spaces(String input){
        int SpaceCount = CountSpaces(input);
        int newLength = input.length() + SpaceCount * 2;
        char[] str = new char[newLength + 1];
        str[newLength] = '\0'; // \0 = null character
        for(int i = input.length() - 1; i >= 0; i--){
            if(input.charAt(i) == ' '){
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = input.charAt(i);
                newLength = newLength - 1;
            }
        } 
        System.out.println(str);
    }
    
    public static int CountSpaces(String input){
        int count = 0;
        for(int i = 0; i < input.length(); i++){
           if(input.charAt(i) == ' '){
               count++;
           }
       } 
       return count;
    }
}
