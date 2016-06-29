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
public class RotateMatrix {
    
    public static void main(String[] args){
        int[][]matrix = new int[4][4];
        
        fillMatrix(matrix);
        printMatrix(matrix);
        rotate(matrix,matrix.length);
        System.out.println();
        printMatrix(matrix);
    }
    
    public static void fillMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j]= 1 + (int)(Math.random() * 9);
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
    
    public static void rotate(int [][]matrix, int n){
        /* n / 2 because is a NxN matrix each layer would be n/2 from outside to inside
           in the case matrix is 4 would be a rotation a 2
        */
        for(int layer = 0; layer < n / 2 ; ++layer){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; ++i){
                int offset = i - first;
                //save top
                int top = matrix[first][i];
                //left to top
                matrix[first][i] = matrix[last-offset][first];
                //bottom to left
                matrix[last-offset][first] = matrix[last][last-offset];
                //right to bottom
                matrix[last][last-offset] = matrix[i][last];
                //top to right
                matrix[i][last] = top;
            }
        }
    }
}
