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
public class SherlockAndTheBeast {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i= 0; i < n ;i++){
            int x = in.nextInt();
            System.out.println(DescentNumber(x));
        }
    }
    
    public static String DescentNumber(int x){
        String num = "-1";
        for(int i = x; i >= 0; i--){
            if((i%3) == 0 && ((x-i)%5) == 0){
                num = createDN(i,x-i);
                break;
            } else if((i%5) == 0 && ((x-i)%3) == 0){
                num = createDN(i,x-i);
            }
        }
        
        return num;
    }
    
    public static String createDN(int a, int b){
        StringBuilder print = new StringBuilder();
        for(int i = 0; i < a; i++){
            print.append("5");
        }
        for(int j = 0; j < b; j++){
            print.append("3");
        }
        
        return print.toString();
    }
    
    
    
}
