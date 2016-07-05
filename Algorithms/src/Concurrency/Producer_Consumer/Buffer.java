/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency.Producer_Consumer;

/**
 *
 * @author alex
 */
public class Buffer {
    
    private static Buffer instance;
    private char data[];
    private int index;
    
    private Buffer(){
        data = new char[Application.BUFFER_SIZE];
        index = 0;
    }
    
    private synchronized static void createInstance(){
        if(instance == null){
            instance = new Buffer();
        }
    }
    
    public static Buffer getInstance(){
        if(instance == null){
            createInstance();
        }
        
        return instance;
    }
    
    public synchronized void put(char c){
        while(index == data.length){
            try{
                wait();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        data[index++] = c;
        notify();
    }
    
    public synchronized char get(){
        char c;
         while(index == 0){
            try{
                wait();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        c = data[--index];
        notify();
        return c;
    }
}
