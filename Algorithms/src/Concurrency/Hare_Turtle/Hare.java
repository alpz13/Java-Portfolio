/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Hare_Turtle;

import java.util.*;

/**
 *
 * @author alex
 */
public class Hare extends Thread{
    
    private int Actual_Dist, Final_Dist;
    private boolean finish;
    private static final Random r = new Random();
    
    public Hare(int Fina_Dist){
        this.Final_Dist = Final_Dist;
        this.Actual_Dist = 0;
        this.finish = false;
    }
    
    public void run(){
        Actual_Dist = 0;
        finish = false;
        while(!finish && Actual_Dist < Final_Dist){
            Actual_Dist += r.nextInt(6) + 5;
            System.out.println("Hare " + getId() + " distance = " + Actual_Dist);
            try{
                Thread.sleep(r.nextInt(1501) + 1500);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        finish = true;
        System.out.println("Hare " + getId() + " has reached the goal");
    }
    
    public void finishedTheThread(){
        finish = true;
    }
    
    public boolean reachTheGoal(){
        return(finish);
    }
    
}
