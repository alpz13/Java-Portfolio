package ThirtyDaysOfCode.DayFive;

import java.util.Scanner;

public class Loops {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printMult(n);
        scanner.close();
    }
    
    private static void printMult(int n) {
    	for(int i = 1 ; i <= 10 ; i++) {
    		System.out.println(n + " x " + i + " = " + n*i);
    	}
    }
}
