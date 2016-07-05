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
public class Counter {
    
    private int counter;
    
    public Counter(){
        counter = 0;
    }
    
    public synchronized void Add(){
        counter++;
    }
    
    public synchronized int getCounter(){
        return counter;
    }
}
