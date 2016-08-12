/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Permutation;

/**
 *
 * @author alex
 */
public class PermutationGivenN {
    
    public static void printAllPwithKLength(int[] arr, int len){
        int n = arr.length;
        StringBuilder s = new StringBuilder();
        print(arr, s, n, len);
    }
    
    public static void print(int[] set, StringBuilder prefix, int n, int len){
        if(len == 0){
            System.out.println(prefix);
        }
        for(int i = 0; i < n ; i++){
            StringBuilder newPrefix = new StringBuilder();
            newPrefix.append(prefix);
            //String newPrefix = prefix + set[i];
            print(set, newPrefix, n, len - 1);
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3};
        permitationInt(arr, "", 3);
    }
        
    private static void permitationInt(int[]arr, String prefix, int length){
        if(prefix.length() == length){
            System.out.println(prefix);
        } else {
            for(int i  = 0; i < arr.length; i++){
                permitationInt(arr, prefix + arr[i],length);
            }
        }
    }
    
    private static void combinationInt(int[]arr, String prefix, int length){
        if(prefix.length() == length){
            System.out.println(prefix);
        } else {
            for(int i  = 0; i < arr.length; i++){
                combinationInt(arr, prefix + arr[i],length);
            }
        }
    }
    
}
