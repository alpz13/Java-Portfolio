/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * Run Time Polymorphism commonly known as Overriding
 * @author alex
 */
public class RunPolymorphism extends RunPolymorphismSupp {
    
   public static void main (String[] args){
       
       RunPolymorphismSupp rp = new RunPolymorphism();
       rp.over();
       
   }
   
   public void over() {
       System.out.println("Method Overriden");
   }
}
