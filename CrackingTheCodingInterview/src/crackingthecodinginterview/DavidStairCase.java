package crackingthecodinginterview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DavidStairCase {
	
	private static HashMap<Integer, Integer> cache = new HashMap<>();
	
	  static int stepPerms(int n) {
	        if (n < 0) {
	            return 0;
	        }
	        if (cache.containsKey(n)) {
	            return cache.get(n);
	        }
	        int ways = stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
	        cache.put(n, ways);
	        return ways;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int s = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        cache.put(0,1);

	        for (int sItr = 0; sItr < s; sItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int res = stepPerms(n);

	            bufferedWriter.write(String.valueOf(res));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
}
