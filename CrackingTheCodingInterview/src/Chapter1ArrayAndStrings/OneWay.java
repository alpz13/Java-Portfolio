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
public class OneWay {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        System.out.println(Edit(input1,input2));
    }
    
    public static boolean Edit(String one, String two){
        if(one.length() == two.length()){
            return replace(one, two);
        } else if(one.length() + 1 == two.length()){
            return modify(one, two);
        } else if(one.length() - 1 == two.length()){
            return modify(two, one);
        }
        return false;
    }
    
    public static boolean replace(String first, String second){
        boolean dif = false;
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                if(dif){
                    return false;
                }
                dif = true;
            }
        }
        return true;
    }
    
    public static boolean modify(String first,String second){
        int index1 = 0;
        int index2 = 0;
        while(index2 < second.length() && index1 < first.length()){
            if(first.charAt(index1) != second.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
    
}
