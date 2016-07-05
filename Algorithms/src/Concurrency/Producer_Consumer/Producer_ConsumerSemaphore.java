/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Producer_Consumer;

import java.util.concurrent.Semaphore;

/**
 *
 * @author alex
 */
public class Producer_ConsumerSemaphore {
    private static final int MAX_CONCURRENT_THREADS = 2;
    private final Semaphore AdminLOCK = new Semaphore(MAX_CONCURRENT_THREADS, true);
    
    public void StartTest() {
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.start();
        }
    }
    
    public class Person extends Thread {
        @Override
        public void run() {
            try {
                
                // Acquire Lock
                AdminLOCK.acquire();
            } catch (InterruptedException e) {
                System.out.println("received InterruptedException");
                return;
            }
            System.out.println("Thread " + this.getId() + " start using car - Acquire()");
            try {
                sleep(1000);
            } catch (Exception e) {
                
            } finally {
                
                // Release Lock
                AdminLOCK.release();
            }
            System.out.println("Thread " + this.getId() + " stops using car - Release()\n");
        }
    }
    
    public static void main(String[] args) {
        Producer_ConsumerSemaphore test = new Producer_ConsumerSemaphore();
        test.StartTest();
        
    }
}