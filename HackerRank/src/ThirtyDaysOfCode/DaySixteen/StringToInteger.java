package ThirtyDaysOfCode.DaySixteen;

import java.util.Scanner;

public class StringToInteger {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convert(S);
    }
    
    private static void convert(String s){
        try{
            int num = Integer.parseInt(s);
            System.out.println(num);
        }catch(Exception e){
            System.out.println("Bad String");
        }
    }

}
