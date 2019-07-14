import java.io.*;
import java.util.*;

public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s == null || s.equals("") || s.trim().equals("")){
            System.out.println("0");
        } else {
            String[] items = s.trim().split("[ !,?.\\_'@]+");
            System.out.println(items.length);
            for(String i : items){
                System.out.println(i);
            }
        }
        scan.close();
    }
}

