package ThirtyDaysOfCode.DayFourteen;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n ; i ++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		Scope scope = new Scope(a);
		scope.computeDifference();
		
		System.out.println(scope.maximumDifference);
	}

}
