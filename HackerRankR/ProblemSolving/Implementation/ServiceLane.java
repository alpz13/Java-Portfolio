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
public class ServiceLane {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //n is length of freeway
        int n = in.nextInt();
        //t is the number of test cases;
        int test = in.nextInt();
        int width[] = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            width[i] = in.nextInt();
        }
        for(int j = 0; j < test; j++){
            int x = in.nextInt();
            int y = in.nextInt();
            //this is not suitable since runtime goes nuts
            System.out.println(Service(x,y, width));
        }
        
    }
    
    public static int Service(int a, int b,int width[]){
        int min = Integer.MAX_VALUE;
        for(int i = a; i <= b ; i++){
            if(width[i] < min){
                min = width[i];
            }
        }
        
        return min;
    }
    
}
