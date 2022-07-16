import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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