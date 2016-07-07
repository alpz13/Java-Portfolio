/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4TreesAndGraphs;

import java.util.Random;

/**
 *
 * @author alex
 */
public class RandomNode {
    
    private int data;
    public RandomNode left;
    public RandomNode right;
    private int size = 0;
    
    public RandomNode(int d){
        data = d;
        size = 1;
    }
    
    /*Random could be a problem, teachers had told me that random calls and random numbers
    should be avoided. since they can cost a lot to the system
    */
    /*
        A possible solution = generate that random store it in a node or int and move to 
        a location then insert the node
    */
    public RandomNode getRandomNode(){
        int leftSize;
        if(left == null){
            leftSize = 0;
        } else {
            leftSize = left.size;
        }
        
        Random random = new Random();
        int index = random.nextInt(size);
        if(index < leftSize){
            return left.getRandomNode();
        } else if(index == leftSize){
            return this;
        } else {
            return right.getRandomNode();
        }
    }
    
    public void insertInOrder(int d){
        if(d <= data){
            if(left == null){
                left = new RandomNode(d);
            } else {
                left.insertInOrder(d);
            }
        } else {
            if(right == null){
                right = new RandomNode(d);
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public int data(){
        return data;
    }
    
    public RandomNode  find(int d){
        if(d == data){
            return this;
        } else if(d <= data){
            if(left != null){
                return left.find(d);
            } else {
                return null;
            }
        } else if(d >= data){
            if(right != null){
                return right.find(d);
            } else {
                return null;
            }
        }
        return null;
    }
}
