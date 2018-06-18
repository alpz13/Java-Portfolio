package ThirtyDaysOfCode.DaySix;

import java.util.Scanner;

public class LetsReview {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n  =  scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println(method(scan.nextLine()));
			
		}
		
		scan.close();
	}

	private static String method(String s) {
		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(isEven(i) == true) {
				odd.append(s.charAt(i));
			} else {
				even.append(s.charAt(i));
			}
		}
		return odd.toString() + " " + even.toString();
	}
	
	private static boolean isEven(int i) {
		if(i % 2 == 0) {
			return true;
		}
		return false;
	}
}
