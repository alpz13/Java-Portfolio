/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Fork_Join;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author alex
 */
public class ForkMain {
    public static final long NUM_RECTS = 1_000_000_000;
    public static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    
    public static void main(String[] args){
        ForkJoinPool pool = new ForkJoinPool(AVAILABLE_PROCESSORS);
        long start, end;
        double width, area;
        
        width = 1.0 / NUM_RECTS;
        start = System.currentTimeMillis();
        area = pool.invoke(new ForkPI(0, NUM_RECTS, width));
        end = System.currentTimeMillis();
        
        System.out.println("PI = " + area);
        System.out.println("TIME = " + ((end - start) / 1000.0) + " secs");
        
    }
}
