package crackingthecodinginterview;

import java.util.Scanner;

public class BubbleSort {
	
	static int countSwaps(int[] a) {
		
		int numSwaps =  0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length - 1 ; j++) {
				
				if(a[j] > a[j + 1]) {
					swap(a, j , j+1);
					numSwaps++;
				}
			}
			
			
		}
		
		return numSwaps;

    }

	static void swap(int[]a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int swaps = countSwaps(a);
        
        System.out.println("Array is sorted in " + swaps +" swaps.");
        System.out.println("First Element: " + a[0] );
        System.out.println("Last Element: " + a[a.length - 1]);

        scanner.close();
    }
}
