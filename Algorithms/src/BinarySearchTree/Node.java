/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author alex
 */
public class Node {
    
    Node left, right;
    int data;
    
    public Node(){
        left = null;
        right = null;
        data = 0;
    }
    
    public Node(int n ){
        left = null;
        right = null;
        data = n;
    }
    
    public void setLeft(Node n){
        left = n;
    }
    
    public void setRight(Node n){
        right = n;
    }
    
    public void setData(int d){
        data = d;
    }
    
    public Node getLeft(){
        return left;
    }
    
    public Node getRight(){
        return right;
    }
    
    public int getData(){
        return data;
    }
}
