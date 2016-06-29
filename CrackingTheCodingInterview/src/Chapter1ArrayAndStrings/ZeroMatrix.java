/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1ArrayAndStrings;

/**
 *
 * @author alex
 */
public class ZeroMatrix {
    
    public static void main(String[] args){
        int[][]matrix = new int[7][4];
        fillMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        setZeros(matrix);
        printMatrix(matrix);
    }
    
    public static void fillMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j]= 0 + (int)(Math.random() * 9);
            }
        }
    }
    
    public static void printMatrix(int[][]matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public static void setZeros(int[][] matrix){
        boolean rowZero = false;
        boolean colZero = false;
        
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                rowZero = true;
                break;
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                colZero = true;
                break;
            }
        }
        
        for(int i = 1 ; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix,i);
            }
        }
        
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                nullifyCol(matrix,j);
            }
        }
        
        if(rowZero){
            nullifyRow(matrix,0);
        }
        
        if(colZero){
            nullifyCol(matrix,0);
        }
    }
    
    public static void nullifyRow(int[][]matrix, int n){
        for(int i = 0; i < matrix[i].length;i++){
            matrix[n][i] = 0;
        }
    }
    
    public static void nullifyCol(int[][]matrix, int n){
        for(int i = 0; i < matrix.length;i++){
            matrix[i][n] = 0;
        }
    }
    
}
