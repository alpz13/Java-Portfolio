/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3StackAndQueue;

/**
 *
 * @author alex
 */
public class StackMin extends Stack<Integer> {
    Stack<Integer> s2;
    
    public StackMin(){
        s2 = new Stack<Integer>();
    }
    
    public void push(int value){
        if(value <= min()){
            s2.push(value);
        }
        super.push(value);
    }
    
    public Integer pop(){
        int value = super.pop();
        if(value == min()){
            s2.pop();
        }
        return value;
    }
    
    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        } else {
            return s2.peak();
        }
    }
    
}
