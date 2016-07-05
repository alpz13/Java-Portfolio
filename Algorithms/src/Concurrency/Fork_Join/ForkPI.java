/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Fork_Join;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author alex
 */
public class ForkPI extends RecursiveTask<Double> {
    private static final long serialVersionUID = 795529753930114947L;
    private static final long MIN = 1_000_000;
    private long start, end;
    private double width;
    
    public ForkPI(long start, long end, double width){
        this.start = start;
        this.end = end;
        this.width = width;
    }
    
    //this is how PI s calculated, i dont understan much here
    protected double calculatePI(){
        double mid, height, sum;
        sum = 0;
        for(long i = this.start; i < this.end ; i++){
            mid = (i + 0.5) * this.width;
            height = 4.0 / (1.0 + mid * mid);
            sum += height;
        }
        return sum;
    }
    
    @Override
    protected Double compute(){
        if((this.end - this.start) <= ForkPI.MIN){
            return this.calculatePI();
        
        }else {
            long mid = start + ((end - start) / 2);
            ForkPI lowerMid = new ForkPI(start,mid,width);
            lowerMid.join();
            ForkPI upperMid = new ForkPI(mid,end,width);
            return (upperMid.compute() + lowerMid.join());
        }
        
    }
}
