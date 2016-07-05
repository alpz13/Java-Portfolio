/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Hare_Turtle;

/**
 *
 * @author alex
 */
public class TurtleHare {
    public static void main(String[] args){        
        Hare l = new Hare(20);
        Turtle t = new Turtle(20);
        boolean end = false;
        l.start();
        t.start();
        while(!end){
            if(!end && l.reachTheGoal()){
                System.out.println("The winner is.... Hare");  
                t.finishedTheThread();
                end = true;
            }else if(!end && t.reachTheGoal()){
               System.out.println("The winners is.... Turtle");
               l.finishedTheThread();
               end = true;
            }
        }
            
    }
    
}
