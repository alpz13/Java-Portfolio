/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Producer_Consumer;

import java.util.*;

/**
 *
 * @author alex
 */
public class Consumer extends Thread {
    
    private static Random r = new Random();
    private int factor, timeout, loop;
    
    public Consumer(int f, int t, int l){
        factor = f;
        timeout = t;
        loop = l;
    }
    
    public void hold(){
        try{
            Thread.sleep((r.nextInt(factor) + 1) * timeout);
        } catch(InterruptedException ie){
           ie.printStackTrace();
        }
    
    }
    
    public void run(){
        char c;
        
        System.out.println("\t\tConsumer " + getId() + " started");
		for (int i = 0; i < loop; i++) {
			c = Buffer.getInstance().get();
			System.out.println("\t\tConsumer " + getId() + " get " + c);
			hold();
		}
	System.out.println("\t\tConsumer " + getId() + " finished");
    }
    
}
