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
public class SimpleArraySum {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(ArraySum(arr));
        
    }
    
    static int ArraySum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    
}
