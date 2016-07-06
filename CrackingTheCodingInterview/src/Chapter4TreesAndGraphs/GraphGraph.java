/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4TreesAndGraphs;

/**
 *
 * @author alex
 */
public class GraphGraph {
    private GraphNode vertex[];
    public int count;
    public GraphGraph(){
        vertex = new GraphNode[6];
        count = 0;
    }
    
    public void addNodeGraph(GraphNode n){
        if(count < 30){
            vertex[count] = n;
            count++;
        } else {
            System.out.println("Graph is full");
        }
    }
    
    public GraphNode[] getNodesGraph(){
        return vertex;
    }
    
}
