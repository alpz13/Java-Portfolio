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
public class Kangaroo {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        
        if((v2 - v1) == 0){
            System.out.println("NO");
        }
        
        double res = (x1 - x2) / (v2 - v1);
        String ress = (res > 0 && (x1 - x2) % (v2 - v1) == 0) ? "YES" : "NO";
        System.out.println(ress);
        
    }
    
}
