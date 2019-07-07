
public class Generics {
	
	public static void main(String[] args) {
		Integer[] intArray1;
		Integer[] intArray2 = new Integer[4];
		printArray(intArray2);
	}
	
	private static <E> void printArray(E[] array) {
		for(E element : array) {
			System.out.println(element);
		}
	}
}
