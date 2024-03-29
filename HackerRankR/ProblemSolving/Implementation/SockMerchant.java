import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        /*
        Map<Integer, Integer> socks = new HashMap<Integer, Integer>();
        for(int i = 0; i < ar.length ; i++){
            if(socks.containsKey(ar[i])){
                socks.put(ar[i], socks.get(ar[i]) + 1);
            } else {
                socks.put(ar[i], 1);
            }
        }
        */
        int pairs = 0;
        /*
        for(Integer i : socks.keySet()){
            pairs += countPairs(socks.get(i));
        }
        */
        
        
        
        Arrays.sort(ar);
        for(int i = 0; i < ar.length - 1; i++){
            if(ar[i] == ar[i+1]){
                pairs++;
                i++;
            }
        }
        return pairs;

    }
    
    static int countPairs(int socks){
        int pair = 0;
        while(socks > 1){
            socks -= 2;
            pair++;
        }
        return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
