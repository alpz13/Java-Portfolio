/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3StackAndQueue;

import java.util.*;

/**
 *
 * @author alex
 */
public class Queue<T> {
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;
        
        public QueueNode(T data){
            this.data = data;
        }
    }
    
    private QueueNode<T> first;
    private QueueNode<T> last;
    
    public void add(T item){
        QueueNode<T> newNode = new QueueNode<T>(item);
        if(last != null){
            last.next = newNode;
        }
        last = newNode;
        if(first == null){
            first = last;
        }
    }
    
    public T remove(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }
    
    public T peek(){
        if(first == null){
            throw new EmptyStackException();
        }
        return first.data;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    
}
