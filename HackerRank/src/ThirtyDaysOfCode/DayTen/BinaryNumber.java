package ThirtyDaysOfCode.DayTen;

import java.util.Scanner;

public class BinaryNumber {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(binaryCount(n));
        scanner.close();
    }

    static int binaryCount(int n) {
    	int count = 0;
    	int max = 0;
    	
    	while(n > 0) {
            if(n % 2 == 1) {
                count++;
                if(count >= max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            n = n / 2;
        }
    	return max;
    }

}
