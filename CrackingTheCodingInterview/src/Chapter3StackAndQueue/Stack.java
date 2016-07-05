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
public class Stack<T> {

    /** 4 basic methods + constructor of new node of the stack
     *   pop() takes out the head or upper element of the stack
     *   push() adds a new element at the top
     *   peek() returns the top node without taking it out of the stack
     *   isEmpty() checks if the stack is empty
     */  
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        
        public StackNode(T data){
            this.data = data;
        }
    }
    
    private StackNode<T> top;
    
    public T pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }
    
    public void push(T item){
        StackNode<T> newItem = new StackNode<T>(item);
        newItem.next = top;
        top = newItem;
    }
    
    public T peak(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
}
