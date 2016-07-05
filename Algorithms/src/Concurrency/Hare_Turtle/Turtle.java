/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Hare_Turtle;

import java.util.Random;

/**
 *
 * @author alex
 */
public class Turtle extends Thread {
     private int Actual_Dist, Final_Dist;
    private boolean finish;
    private static final Random r = new Random();
    
    public Turtle(int DFinal){
        this.Actual_Dist = 0;
        this.Final_Dist = Final_Dist;
        this.finish = false;
    
    }
    
    public void run(){
        
        Actual_Dist = 0;
        finish = false;
        while(!finish && Actual_Dist < Final_Dist){
            Actual_Dist += r.nextInt(2) + 1;
            System.out.println("Turtle " + getId() + " distance = " + Actual_Dist);
        }
        finish = true;
        System.out.println("Turtle " + getId() + " has reached the goal");  
    
    }
    
    public void finishedTheThread(){
        finish = true;
    }
    
    public boolean reachTheGoal(){
        return (finish);
    }
    
}
