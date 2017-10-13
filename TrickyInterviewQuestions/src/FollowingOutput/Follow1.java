/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FollowingOutput;

import java.util.Arrays;

/**
 *
 * @author alex
 */
public class Follow1 {
    
    public static void main(String[] args) {
        
        // Double.min 2^(-1074), prints 0.0 because Double.Min_value is greater than Zero
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        
        
        //Not Arithmetic Exception, (curious)
        System.out.println(1.0/0.0);
        
        //YOU CANNOT, (I REPEAT) CANNOT OVERRIDE A PRIVATE OR STATIC METHOD IN JAVA.
        //(you cannot instanciate a final class)
        
        //Java(7) does not support multiple inheritance. Strickly taking about inheritance
        //but you can implement it using interfaces.
        
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes =  str.getBytes();
        System.out.println(Arrays.toString(bytes));
        
    }
    
}
