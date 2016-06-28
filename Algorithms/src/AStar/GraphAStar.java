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
public class GraphAStar<T> implements Iterable<T> {
    /***
     * A map from the Node id to outgoing edge.
     * An outgoing edge is represented as a Node and the length
     */
    Map<T, Map<Node<T>, Double>> graph;
    /***
     * A map of heuristic from a node to each other node in the graph
     */
    Map<T, Map<T,Double>> heuristicMap;
    /***
     * A map between the Node id and its data.
     */
    Map<T, Map<T,Double>> nodeIdNode;
    
    public GraphAStar(Map<T, Map<T,Double>> heuristicMap){
        if(heuristicMap == null){
            throw new NullPointerException("The heuristic map should not be null");
        }
        graph = new HashMap<T, Map<Node<T>, Double>>();
        nodeIdNode = new HashMap<>();
        this.heuristicMap = heuristicMap;
    }
    
    /***
     * Adds a new node to the graph
     * Internally it creates the Node and populate the heuristic map with node input to node data
     * @param nodeId the node to be added
     */
    public void addNode(T nodeId){
        if(nodeId == null){
            throw new NullPointerException("The node cannot be null");
        }
        if(!heuristicMap.containsKey(nodeId)){
            throw new NoSuchElementException("This node is not part of the heuristic Map");
        }
        graph.put(nodeId, new HashMap<Node<T>,Double>());
        nodeIdNode.put(nodeId, (Map<T, Double>) new Node<T>(nodeId, heuristicMap.get(nodeId)));
    }
   

    
    /***
     * Adds an edge from source node to destination node
     * there can only be a single edge from source to node.
     * Adding additional  edge would be overwrite the value.
     * @param From     the first node to be in the edge
     * @param To       the second node to be in the edge
     * @param length   the length of node From and To
     */
    public void addEdge(T From, T To, double length){
        if(From == null || To == null){
            throw new NullPointerException("Either of the nodes cannot be null");
        }
        if(!heuristicMap.containsKey(To) || !heuristicMap.containsKey(From)){
            throw new NoSuchElementException("Either of the nodes should be listed in the heuristic map");
        }
        if(!graph.containsKey(To) || !graph.containsKey(From)){
            throw new NoSuchElementException("Either of the nodes should be part of the graph");
        }
        graph.get(From).put((Node<T>) nodeIdNode.get(To), length);
        graph.get(To).put((Node<T>) nodeIdNode.get(From), length);
    }
    /***
     * Returns immutable view of edges  
     * @param nodeId the node whose outgoing needs to be returned.
     * @return       An immutable view of the edges leaving that node.
     */
    public Map<Node<T>,Double> edgesFrom(T nodeId){
        if(nodeId == null){
            throw new NullPointerException("The input node should not be null");
        }
        if(!heuristicMap.containsKey(nodeId)){
            throw new NoSuchElementException("This node should be part of the heuristic map");
        }
        if(!graph.containsKey(nodeId)){
            throw new NoSuchElementException("Thsi node should be null");
        }
        return Collections.unmodifiableMap(graph.get(nodeId));
    }
    /***
     * the node data corresponding  to the current nodeId
     * @param nodeId  the nodeId to be returned
     * @return        the node data from the node
     */
    public Node<T> getNodeData(T nodeId){
        if(nodeId == null){
            throw new NullPointerException("The node should not be empty");
        }
        if(!nodeIdNode.containsKey(nodeId)){
            throw new NoSuchElementException("The node does not exist");
        }
        return (Node<T>) nodeIdNode.get(nodeId);
    }
    
    /***
     * Returns an iterator  that can  traverse  the nodes of the graph
     * @return an iterator
     */
    @Override
    public Iterator<T> iterator() {
        return graph.keySet().iterator();
    }
    
    
}
