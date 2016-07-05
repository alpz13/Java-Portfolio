/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Park;

/**
 *
 * @author alex
 */
public class Park {
    public static void main(String[] args){
        Counter c = new Counter();
        Gate p1 = new Gate("East",c);
        Gate p2 = new Gate("West",c);
        p1.start();
        p2.start();
    }
}
