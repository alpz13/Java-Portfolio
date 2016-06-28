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
public class StringRotation {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        System.out.println(Rotation(input1,input2));
    }
    
    public static boolean Rotation(String one, String two){
        int len = one.length();
        if(len == two.length() && len > 0){
            String oneone = one + one;
            return Substring(oneone, two);
        }
        return false;
    }
    
    public static boolean Substring(String x, String y){
        return x.toLowerCase().contains(y.toLowerCase());
    }
    
}
