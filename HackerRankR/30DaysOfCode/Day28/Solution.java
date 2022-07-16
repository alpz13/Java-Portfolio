import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Pattern p = Pattern.compile(".+@gmail\\.com");
        Matcher m;
        List<String> name = new ArrayList();
        for(int i = 0; i < N ; i++){
            String firstname = scanner.next();
            String emailID = scanner.next();
            m = p.matcher(emailID);
            if(m.matches()){
                name.add(firstname);
            }
        }
        
        Collections.sort(name);
        for(String n : name){
            System.out.println(n);
        }


        scanner.close();
    }
}
