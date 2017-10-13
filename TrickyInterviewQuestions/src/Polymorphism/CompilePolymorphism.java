/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 * Static Polymorphism commonly known as Overloading
 * @author alex
 */

public class CompilePolymorphism {
    
    public static void main (String[] args){
        CompilePolymorphismSupp cp = new CompilePolymorphismSupp();
        
        System.out.println("Method #1 : " + cp.add(5, 7));
        System.out.println("Method #2 : " + cp.add(5,7,9));
    
    }
    
    
    
}
