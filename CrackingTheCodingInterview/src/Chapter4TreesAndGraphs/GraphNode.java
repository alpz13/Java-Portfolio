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
public class GraphNode {
    
    private GraphNode adjacent[];
    public int adjacentCount;
    private String vertex;
    public RouteBetweenNodes.State state;
    
    public GraphNode(String vertex, int adjacentLength){
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new GraphNode[adjacentLength];
    }
    
    public void addAdjacent(GraphNode n){
        if(adjacentCount < 30){
            this.adjacent[adjacentCount] = n;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent can be added");
        }
    }
    
    public GraphNode[] getAdjacent(){
        return adjacent;
    }
    
    public String getVertex(){
        return vertex;
    }
}
