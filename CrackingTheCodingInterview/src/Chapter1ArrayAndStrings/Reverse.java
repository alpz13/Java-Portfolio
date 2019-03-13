package Chapter1ArrayAndStrings;

public class Reverse {

	
	public static void main(String[] args) {
	
		System.out.println("Hola");
		
		System.out.println(reverse("Hola"));
	}
	
	
	public static String reverse(String input) {
		if(input.length() > 1) {
			return (reverse(input.substring(1)) + input.charAt(0));
		} else {
			return input;
		}
	}
	
	
}
