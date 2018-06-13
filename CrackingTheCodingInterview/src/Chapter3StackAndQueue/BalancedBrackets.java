package Chapter3StackAndQueue;

import java.util.Scanner;

public class BalancedBrackets {
	
	private static final Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int t = s.nextInt();
		s.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
		
		for(int i = 0 ; i < t ; i++) {
			String expression = s.nextLine();
			
			System.out.println(isMatched(expression) ? "YES" : "NO");
		}
		
		s.close();
	}
	
	static boolean isMatched(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c :  s.toCharArray()) {
			if( c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if(!(( c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
