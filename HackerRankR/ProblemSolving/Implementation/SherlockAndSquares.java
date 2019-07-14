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
public class SherlockAndSquares {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i = 0; i < test ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(SquareInteger(a,b));
        }
    }
    
    public static int SquareInteger(int a, int b){      
        return (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;
    }
    
}
