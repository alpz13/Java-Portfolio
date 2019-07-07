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
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int N = Integer.parseInt(nk[0]);

            int K = Integer.parseInt(nk[1]);
            int max = 0;
            for (int j = 1; j < N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    int h = j & k;
                    if (h < K && max < h) max = h;
                }
            }
            
            System.out.println(max);
            
        }

        scanner.close();
    }
}
