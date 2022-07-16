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
public class CircularArrayRotation {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int rot = scan.nextInt();
        int t = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < size; i++){
            int element = scan.nextInt();
            list.add(element);
        }
        for(int i = 0; i < rot; i++){
            list.addFirst(list.getLast());
            list.removeLast();
        }
        while(t>0){
            t--;
            int position = scan.nextInt();
            System.out.println(list.get(position));
        }
    }
}
