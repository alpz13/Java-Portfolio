/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author alex
 */
public class Node {
    public String name;
    public boolean visited = false;
    public Node[] children;
    
    
    public Node(String n){
        this.name = n;
    }
    
}
