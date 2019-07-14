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
public class TimeConversion {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String time = in.next();
        StringBuilder sb = new StringBuilder();
        int hour = 0;
        hour = Integer.parseInt(time.substring(0,2));
        if(time.substring(8,10).equals("PM")){
            if(hour != 12){
                hour = hour + 12; 
            }
        }
        else if(hour == 12){
            hour = 0;
        }
        if(hour  < 10){
            sb.append(0);
        }
        
        sb.append(hour);
        sb.append(time.substring(2,8));
        System.out.println(sb.toString());
            
        
    }
    
    
}
