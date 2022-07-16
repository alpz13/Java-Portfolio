/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import java.util.*;
/**
 *
 * @author alex
 */
public class UtopianTree {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t ; i++){
            int tree = in.nextInt();
            System.out.println(Height(tree));
        }
    }
    
    public static int Height(int x){
        int sum = 1;
        for(int j = 1; j <= x ; j++){
            if(j % 2 == 0){
                sum = sum + 1;
            } else {
                sum = sum + sum;
            }   
        }
        return sum;        
    }
}
