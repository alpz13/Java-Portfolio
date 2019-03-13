package Chapter1ArrayAndStrings;

public class MergeSortedArrays {
	
	
	public static void main(String[] args) {
		
		 	int a[] = {10, 12, 13, 14, 18, 0, 0, 0, 0, 0}; 
	        int b[] = {16, 17, 19, 20, 22}; 
	        //sortedMerge(a, b); 
	        //print(a);
	        sortMerge(a,b);
	        print(a);
	        
	        
	}
	
	private static void print(int arr[])  { 
        System.out.println ( "Array A after merging B in sorted order : " ) ; 
        for (int i = 0; i < arr.length - 1; i++) { 
            System.out.print(arr[i] +" "); 
        }
    } 
	
	private static void sortedMerge(int[] a, int[] b) {
		int i = b.length - 1;
		int j = b.length - 1;
		int last = a.length - 1;
		while(j >= 0){
			if(i >= 0 && a[i] > b[i]) {
				a[last] = a[i];
				i--;
			} else {
				a[last] = b[j];
				j--;	
			}
			last--;
		}
	}

	private static void sortMerge(int[] a, int[] b) {
		int aIndex = b.length - 1;
		int bIndex = b.length - 1;
		int last = a.length - 1;
		while(bIndex >= 0) {
			if(aIndex >= 0 && a[aIndex] > b[aIndex]) {
				a[last] = a[aIndex];
				aIndex--;
			} else {
				a[last]= b[bIndex];
				bIndex--;
			}
			last--;
		}
		
	}
	
	
	

}
