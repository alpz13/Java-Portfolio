/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Park;

import java.util.Random;

/**
 *
 * @author alex
 */
public class Gate extends Thread {
    private static Random r = new Random();
    private Counter myCounter;
    private String name;
    
    public Gate(String n, Counter counter){
        myCounter = counter;
        name = n;
    }
    public void run(){
        for(int i = 0; i < 20; i++){
            myCounter.Add();
            System.out.println("Gate " + name + " Counter " + myCounter.getCounter());
            hold();
        }
    }
    
    public void hold(){
        try{
            Thread.sleep(r.nextInt(250) + 250);
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
