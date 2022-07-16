/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import java.util.*;

/**
 *
 * @author alex
 */
public class FindDigits {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numCases = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < numCases ; i++){
            String input = in.nextLine();
            int number = Integer.parseInt(input);
            String[]arr = input.trim().split("");
            int count = 0;
            for(String num:arr){
                if(!num.equals("") && !num.equals("0") && number%Integer.parseInt(num)==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
