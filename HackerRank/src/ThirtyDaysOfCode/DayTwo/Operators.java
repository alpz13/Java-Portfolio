package ThirtyDaysOfCode.DayTwo;

import java.util.Scanner;

public class Operators {
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		
		System.out.println(tips(mealCost, tipPercent));
		System.out.println(tax(mealCost, taxPercent ));
		System.out.println(Math.round(mealCost + tax(mealCost, taxPercent) + tips(mealCost, tipPercent)));
		scan.close();
	}
	
	private static double tips(double mealCost, int tipPercent) {
		
		return mealCost*(tipPercent / (double) 100);
	}
	private static double tax(double mealCost, int taxPercent) {
		
		return mealCost*(taxPercent/ (double) 100);
	}

}
