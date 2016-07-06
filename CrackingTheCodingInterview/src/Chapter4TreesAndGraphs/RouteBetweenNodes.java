/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4TreesAndGraphs;

import java.util.LinkedList;

/**
 *
 * @author alex
 */
public class RouteBetweenNodes {
    
    enum State {Unvisited, Visited, Visiting;}
    
    public static void main(String[] args){
        GraphGraph g = createNewGraph();
        GraphNode[] n = g.getNodesGraph();
        GraphNode start = n[0];
        GraphNode end = n[5];
        System.out.println(search(g, start, end));
        
    }
    
    public static GraphGraph createNewGraph(){
        GraphGraph g = new GraphGraph();
        GraphNode[] temp = new GraphNode[6];
        temp[0] = new GraphNode("a", 3);
	temp[1] = new GraphNode("b", 0);
	temp[2] = new GraphNode("c", 0);
	temp[3] = new GraphNode("d", 1);
	temp[4] = new GraphNode("e", 1);
	temp[5] = new GraphNode("f", 0);
	
        temp[0].addAdjacent(temp[1]);
	temp[0].addAdjacent(temp[2]);
	temp[0].addAdjacent(temp[3]);
	temp[3].addAdjacent(temp[4]);
	temp[4].addAdjacent(temp[5]);
        
        for (int i = 0; i < temp.length ; i++){
            g.addNodeGraph(temp[i]);
        }
        
        return g;
        
        
    }
    
    public static boolean search(GraphGraph g, GraphNode start, GraphNode end){
        //we are at goal
        if(start == end){
            return true;
        }
        
        LinkedList<GraphNode> list = new LinkedList<GraphNode>();
        for(GraphNode n : g.getNodesGraph()){
            n.state = State.Unvisited;
        }
        
        start.state = State.Visiting;
        list.add(start);
        GraphNode u;
        while(!list.isEmpty()){
            // dequeue
            u = list.removeFirst();
            if(u != null){
                for(GraphNode v : u.getAdjacent()){
                    if(v.state == State.Unvisited){
                        if(v == end){
                            return true;
                        } else {
                            v.state = State.Visiting;
                            list.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}
