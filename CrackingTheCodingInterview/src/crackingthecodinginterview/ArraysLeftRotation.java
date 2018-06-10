package crackingthecodinginterview;

public class ArraysLeftRotation {

    static int[] rotLeft(int[] a, int d) {

    	int[] rotated = new int[a.length];
    	
    	 for(int i=0; i < a.length; i++){
    		 
             rotated[(i + a.length - d) % a.length] = a[i];
             System.out.println((i + a.length - d) % a.length);
         }
    	
        return rotated;

    }
    
    static void printArray(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void main(String[] args) {
    	int arr[] = {1, 2, 3, 4, 5};
    	int arr2[] = rotLeft(arr,4);
    	printArray(arr2);
    }
}
