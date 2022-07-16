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
public class PlusMinus {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int pos = 0;
        int neg = 0;
        int zer = 0;
        
        for(int i=0; i < arr.length ;i++){
            if(arr[i] > 0){
                pos++;
            }
            if(arr[i] < 0){
                neg++;
            }
            if(arr[i] == 0){
                zer++;
            }
        }
        
        System.out.println((double) pos / (double) n);
        System.out.println((double) neg / (double) n);
        System.out.println((double) zer / (double) n);
        
    }
    
}
