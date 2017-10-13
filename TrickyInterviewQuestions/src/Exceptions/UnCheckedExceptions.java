/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author alex
 */
public class UnCheckedExceptions {
    
    public static void main (String[] args){
        int num1=10;
	int num2=0;
	/*Since I'm dividing an integer with 0
	 * it should throw ArithmeticException
         */
	int res=num1/num2;
	System.out.println(res);
    }
}
