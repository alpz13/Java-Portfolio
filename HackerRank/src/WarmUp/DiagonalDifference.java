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
public class DiagonalDifference {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int diag1=0,diag2 = 0;
        for(int i = 0 ; i < a.length; i++){
            diag1 += a[i][i];
            diag2 += a[i][a.length-i-1];
        }
        
        System.out.println(Math.abs(diag1-diag2));
       
    }
    
}
