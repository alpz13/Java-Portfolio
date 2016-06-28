/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import java.util.*;

/**
 *
 * @author alex
 */
public class BinarySearch {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        int searchValue = 0, index;
        System.out.println("Enter 10 numbers");
        for(int i  = 0; i < array.length; i++){
            array[i]= in.nextInt();
        }
        System.out.println("Enter a number to search");
        searchValue = in.nextInt();
        
        index = binarySearch(array, searchValue);
        if(index != -1 ){
            System.out.println("Value found at index :" + index);
        } else {
            System.out.println("Value not found");
        }
    }
    
    public static int binarySearch(int arr[], int value){
        int start, end, mid;
        start = 0;
        end = arr.length - 1;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == value){
                return mid;
            } else if (arr[mid] < value){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
}
