import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for(int i = start; i <= end - 1; i++){
            sb.append(S.charAt(i));
        }
        
        System.out.println(sb.toString());
        
    }
}