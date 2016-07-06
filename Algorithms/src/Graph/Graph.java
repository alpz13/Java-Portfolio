/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.*;

/**
 *
 * @author alex
 */
public class Graph {
    public Node root;
    public ArrayList nodes = new ArrayList();
    public int[][] adjMatrix;
    int size;
    
    public void setRootNode(Node n){
        this.root = n;
    }
    
    public Node getRootNode(){
        return this.root;
    }
    
    public void addNode(Node n){
        nodes.add(n);
    }
    
    public void connectNode(Node start, Node end){
        if(adjMatrix == null){
            size = nodes.size();
            adjMatrix = new int[size][size];
        }
        int startIndex = nodes.indexOf(start);
        int endIndex = nodes.indexOf(end);
        adjMatrix[startIndex][endIndex] = 1;
        adjMatrix[endIndex][startIndex] = 1;
    }
    
    public Node getUnvisitedChildNode(Node n){
        int index = nodes.indexOf(n);
        int j = 0;
        while(j < size){
            if(adjMatrix [index][j] == 1 && ((Node)nodes.get(j)).visited == false){
                return (Node)nodes.get(j);
            }
            j++;
        } 
        return null;
    }
    
    public void BreadthFirstSearch(){
        Queue q = new LinkedList();
        q.add(this.root);
        printNode(this.root);
        root.visited = true;
        while(!q.isEmpty()){
            Node n = (Node)q.remove();
            Node child = null;
            while((child = getUnvisitedChildNode(n)) != null){
                child.visited = true;
                printNode(child);
                q.add(child);
            }
        }
        clearNodes();
    }
    
    public void DepthFirstSearch(){
        Stack s = new Stack();
        s.push(this.root);
        root.visited = true;
        printNode(root);
        while(!s.isEmpty()){
            Node n = (Node)s.peek();
            Node child = getUnvisitedChildNode(n);
            if(child != null){
                child.visited = true;
                printNode(child);
                s.push(child);
            } else {
                s.pop();
            }
        }
        clearNodes();
    }
    
    private void clearNodes(){
        int i = 0;
        while(i < size){
            Node n = (Node)nodes.get(i);
            n.visited = false;
            i++;
        }
    }
    
    private void printNode(Node n){
        System.out.println(n.name + " ");
    }
    
    public static void main(String[] args){
        //Lets create nodes as given as an example in the article
		Node nA=new Node("A");
		Node nB=new Node("B");
		Node nC=new Node("C");
		Node nD=new Node("D");
		Node nE=new Node("E");
		Node nF=new Node("F");

		//Create the graph, add nodes, create edges between nodes
		Graph g=new Graph();
		g.addNode(nA);
		g.addNode(nB);
		g.addNode(nC);
		g.addNode(nD);
		g.addNode(nE);
		g.addNode(nF);
		g.setRootNode(nA);
		
		g.connectNode(nA,nB);
		g.connectNode(nA,nC);
		g.connectNode(nA,nD);
		
		g.connectNode(nB,nE);
		g.connectNode(nB,nF);
		g.connectNode(nC,nF);
		
		
		//Perform the traversal of the graph
		System.out.println("DFS Traversal of a tree is ------------->");
		g.DepthFirstSearch();
		
		System.out.println("\nBFS Traversal of a tree is ------------->");
		g.BreadthFirstSearch();
    
    }
}

