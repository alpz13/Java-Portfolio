/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

/**
 *
 * @author alex
 */
public class Dijkstra {
    static Graph.Edge[] GRAPH = {
      new Graph.Edge("a", "b", 7),
      new Graph.Edge("a", "c", 9),
      new Graph.Edge("a", "f", 14),
      new Graph.Edge("b", "c", 10),
      new Graph.Edge("b", "d", 15),
      new Graph.Edge("c", "d", 11),
      new Graph.Edge("c", "f", 2),
      new Graph.Edge("d", "e", 6),
      new Graph.Edge("e", "f", 9),
    };
    
    static String START = "a";
    static String END = "e";
    public static void main(String[] args){
        Graph g = new Graph(GRAPH);
        g.dijkstra(START);
        g.printPath(END);
        //g.printAllPaths();
    }
}
