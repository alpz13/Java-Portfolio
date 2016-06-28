/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AStar;

import java.util.*;
/**
 *
 * @author alex
 */
public class Node <T> {
    
    T nodeId;
    Map<T, Double> heuristic;
    
    double g; //distance to new node
    double h; //distante to goal
    double f; // f = g + h;
    
    public Node(T nodeId,Map<T,Double> heuristic){
        this.nodeId = nodeId;
        this.g = Double.MAX_VALUE;
        this.heuristic = heuristic;
    }
    
    public T getNode(){
        return nodeId;
    }
    
    public double getGPath(){
        return g;
    }
    
    public void setGPath(double g){
        this.g = g;
    }
    
    public void CalculateF(T destination){
        this.h = heuristic.get(destination);
        this.f = g + h;
    }
    
    public double getH(){
        return g;
    }
    
    public double getF(){
        return f;
    }
    
    
}
