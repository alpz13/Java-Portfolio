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
public class AngryProfessor {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for(int i = 0; i < testcase ; i++){
            int n = in.nextInt();
            // K= at least to have class
            int k = in.nextInt();
            int count = 0;
            int a;
            for(int j=0; j < n; j++){
                a = in.nextInt() ;
                if(a <= 0)
                {
                    count++;
                }
            }
            if(count >= k){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            
        }
        
    }
}
