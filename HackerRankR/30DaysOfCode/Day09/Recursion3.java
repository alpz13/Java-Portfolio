
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recursion3 {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	static int factorial(int n) {
		
		if(n < 2) {
			return 1;
		}
		return n * factorial(n-1);


    }

    

    public static void main(String[] args) throws IOException {
   

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);

        scanner.close();
    }
}


