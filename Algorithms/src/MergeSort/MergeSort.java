/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSort;

/**
 *
 * @author Alex Lp
 */
public class MergeSort {
    
    private int[] array;
    private int[] temp;
    private int length;
    
    public static void main(String args[]){
        int [] inputarr = {45,23,11,89,66,22,43,56,2};
        MergeSort ms = new MergeSort();
        for(int i:inputarr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
    public void sort(int inputarr[]){
        this.array = inputarr;
        this.length = inputarr.length;
        this.temp = new int[length];
        doMergeSort(0, length - 1);
    }
    
    private void doMergeSort(int lowerIndex, int highIndex){
        if(lowerIndex < highIndex){
            int middle = lowerIndex + (highIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1,highIndex);
            mergeParts(lowerIndex, middle, highIndex);
        }
    }
    
    private void mergeParts(int lowerIndex, int middle, int highIndex){
        for(int i = lowerIndex; i <= highIndex; i++){
            temp[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        while(i <= middle && j <= highIndex){
            if(temp[i] <= temp[j]){
                array[k]= temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            array[k] = temp[i];
            k++;
            i++;
        }
    }
    
}
