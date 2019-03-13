package Chapter1ArrayAndStrings;

public class Knapsack {
	
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main(String args[]) {
		
		//int price[] = new int[] {10,40,50,75};
		//int weight[] = new int [] {5,10,3,12};
		int price[] = new int[] {60,100,120};
		int weight[] = new int [] {10,20,30};
		int capacity = 50;
		int n = price.length;
		System.out.println(knapsackRecursive(capacity, weight, price, n));
		System.out.println(knapsack(capacity, weight, price, n));
	}
	
	
	private static int knapsackRecursive(int W, int[] wt, int[] val, int n) {
		
		if(W == 0 || n == 0) {
			return 0;
		}
		
		if(wt[n-1] > W) {
			return knapsackRecursive(W, wt, val, n-1);
		} else {
			return Math.max(val[n-1] + knapsackRecursive(W-wt[n-1], wt, val, n-1)
					, knapsackRecursive(W, wt, val, n-1));
		}
		
		
	}
	
	private static int knapsack(int W, int[] wt, int[] val, int n) {
		
		int i, w;
		int K[][]= new int[n+1][W+1];
		for(i = 0; i <= n; i++) {
			for( w = 0; w <= W; w++) {
				if(i == 0 || w == 0) {
					K[i][w]= 0;
				} else if(wt[i -1 ] <= w) {
					K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]], K[i-1][w]);
				} else {
					K[i][w] = K[i-1][w];
				}
			}
		}
		
		return K[n][W];
		
	}
}
