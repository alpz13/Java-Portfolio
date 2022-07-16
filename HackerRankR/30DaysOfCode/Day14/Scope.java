
import java.util.Arrays;

public class Scope {
	private int[] elements;
	public int maximumDifference;
	
	public Scope(int[] numbers) {
		this.elements = new int[numbers.length];
		for(int i = 0; i < numbers.length ; i++) {
			this.elements[i] = numbers[i];
		}
	}
	
	public void computeDifference() {
		Arrays.sort(elements);
		this.maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
	}
	
	public int maximumDifference() {
		return this.maximumDifference;
	}

	
	

}
