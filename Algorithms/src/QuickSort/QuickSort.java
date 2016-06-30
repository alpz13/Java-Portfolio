/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author alex
 */
public class QuickSort {
    
    public static void main(String[] args){
        int i ;
        int arr[] = {8,7,13,22,5,792,146,1002,1,27,47};
        System.out.println("Quick Sort");
        System.out.println("Values before Sort");
        printArray(arr);
        System.out.println();
        System.out.println("Values after Sort");
        QuickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
    
    public static void QuickSort(int[] arr, int low, int n){
        int lo = low;
        int hi = n;
        int temp;
        if(low >= n){
            return;
        }
        int mid = arr[(lo + hi) / 2];
        //while searches does not cross
        while(lo < hi){
            //search element higher than pivot
            while(lo < hi && arr[lo] < mid){
                lo++;
            }
            //search element lower than pivot
            while(lo < hi && arr[hi] > mid){
                hi--;
            }
            //if did not cross swap elements
            if(lo < hi){
                temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
            }
        }
        if(hi < lo){
            temp = hi;
            hi = lo;
            low = temp;
        }
        
        QuickSort(arr, low, lo);
        if(lo == low){
            QuickSort(arr, low + 1, n);
        } else {
            QuickSort(arr, lo, n);
        }
    }
    
    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int generateRandom(int lower, int upper){
        return (lower + (int)(Math.random() * upper));
    }
}
