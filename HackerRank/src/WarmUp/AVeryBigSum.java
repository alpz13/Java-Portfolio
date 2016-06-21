/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmUp;

import java.util.*;

/**
 *
 * @author alex
 */
public class AVeryBigSum {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        long sum = 0;
        String [] array;
        String temp = in.nextLine();
        array = temp.split(" ");
        for (int i = 0; i < n; i++) {
            sum += Long.parseLong(array[i]);
        }
        
        System.out.println(sum);
    }
}
