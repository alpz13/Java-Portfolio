
import java.util.Scanner;

public class Sorting {
	
	private static int numberOfSorts = 0;

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] res = bubbleSort(a, n);
        System.out.println("Array is sorted in " + numberOfSorts + " swaps.");
        System.out.println("First Element: " + res[0]);
        System.out.println("Last Element: " + res[n - 1]);
        // Write Your Code Here
    }
	
	private static int[] bubbleSort(int[] a, int n) {
	
		for(int j = 0; j < n; j ++) {
			int temp = 0;
			for(int i = 0; i < n - 1; i++) {
				if(a[i] > a[i + 1] ) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1]= temp;
					numberOfSorts++;
				}
			}
			if(numberOfSorts == 0) {
				break;
			}
		}
		return a;
			
	}
}
