/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AStar;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author alex
 */
public class AStar<T> {
    
    GraphAStar<T> graph;
    
    public AStar(GraphAStar<T> graphA){
        this.graph = graphA;
    }
    
    //extends comparator
    public class NodeComparator implements Comparator<Node<T>>{
        
        public int compare(Node<T> first,Node<T> second){
            if(first.getF() > second.getF()){
                return 1;
            }
            if(second.getF() > first.getF()){
                return -1;
            }
            return 0;
        }
    }
    
    public List<T> Astar(T source, T destination){
        Queue<Node<T>> openQueue = new PriorityQueue<Node<T>>(11,new NodeComparator());
        
        Node<T> sourceNode = graph.getNodeData(source);
        sourceNode.setGPath(0);
        sourceNode.CalculateF(destination);
        openQueue.add(sourceNode);
        
        Map<T, T> path = new HashMap<T, T>();
        Set<Node<T>> closedList = new HashSet<Node<T>>();
        
        while(!openQueue.isEmpty()){
            Node<T> node = openQueue.poll();
            
            if(node.getNode().equals(destination)){
                return path(path,destination);
            }
            
            closedList.add(node);
            
            for(Entry<Node<T>, Double> neighborEntry : graph.edgesFrom(node.getNode()).entrySet()){
                Node<T> neighbor = neighborEntry.getKey();
                
                if(closedList.contains(neighbor)){
                    continue;
                }
                double distanceBetweenTwoNodes = neighborEntry.getValue();
                double tentativeG = distanceBetweenTwoNodes + node.getGPath();
                
                if(tentativeG < neighbor.getGPath()){
                    neighbor.setGPath(tentativeG);
                    neighbor.CalculateF(destination);
                    
                    path.put(neighbor.getNode(), node.getNode());
                    if(!openQueue.contains(neighbor)){
                        openQueue.add(neighbor);
                    }
                }
            
            }
        }
        return null;
    }
    
    private List<T> path(Map<T,T> path, T destination){
        assert path != null;
        assert destination  != null;
        
        List<T> pathList = new ArrayList<T>();
        pathList.add(destination);
        while(path.containsKey(destination)){
            destination = path.get(destination);
            pathList.add(destination);
        }
        Collections.reverse(pathList);
        return pathList;
    }
    
    public static void main(String[] args){
        Map<String, Map<String,Double>> heuristic = new HashMap<String, Map<String,Double>>();
        
        //distance from Node N to all
        Map<String, Double> MapA = new HashMap<String,Double>();
        MapA.put("A", 0.0);
        MapA.put("B", 2.0);
        MapA.put("C", 3.0);
        MapA.put("D", 5.0);
        MapA.put("E", 7.0);
        MapA.put("F", 4.0);
        MapA.put("G", 10.0);
        MapA.put("H", 13.0);
        MapA.put("I", 15.0);
        
        Map<String, Double> MapB = new HashMap<String,Double>();
        MapB.put("A", 2.0);
        MapB.put("B", 0.0);
        MapB.put("C", 5.0);
        MapB.put("D", 3.0);
        MapB.put("E", 4.0);
        MapB.put("F", 6.0);
        MapB.put("G", 6.0);
        MapB.put("H", 10.0);
        MapB.put("I", 14.0);
        
        Map<String, Double> MapC = new HashMap<String,Double>();
        MapC.put("A", 3.0);
        MapC.put("B", 5.0);
        MapC.put("C", 0.0);
        MapC.put("D", 4.0);
        MapC.put("E", 7.0);
        MapC.put("F", 2.0);
        MapC.put("G", 10.0);
        MapC.put("H", 7.0);
        MapC.put("I", 15.0);
        
        Map<String, Double> MapD = new HashMap<String,Double>();
        MapD.put("A", 5.0);
        MapD.put("B", 5.0);
        MapD.put("C", 4.0);
        MapD.put("D", 0.0);
        MapD.put("E", 3.0);
        MapD.put("F", 3.0);
        MapD.put("G", 7.0);
        MapD.put("H", 9.0);
        MapD.put("I", 11.0);
        
        Map<String, Double> MapE = new HashMap<String,Double>();
        MapE.put("A", 7.0);
        MapE.put("B", 4.0);
        MapE.put("C", 7.0);
        MapE.put("D", 3.0);
        MapE.put("E", 0.0);
        MapE.put("F", 9.0);
        MapE.put("G", 2.0);
        MapE.put("H", 11.0);
        MapE.put("I", 9.0);
        
        Map<String, Double> MapF = new HashMap<String,Double>();
        MapF.put("A", 4.0);
        MapF.put("B", 6.0);
        MapF.put("C", 2.0);
        MapF.put("D", 3.0);
        MapF.put("E", 9.0);
        MapF.put("F", 0.0);
        MapF.put("G", 7.0);
        MapF.put("H", 3.0);
        MapF.put("I", 7.0);
        
        Map<String, Double> MapG = new HashMap<String,Double>();
        MapG.put("A", 10.0);
        MapG.put("B", 6.0);
        MapG.put("C", 10.0);
        MapG.put("D", 7.0);
        MapG.put("E", 2.0);
        MapG.put("F", 7.0);
        MapG.put("G", 0.0);
        MapG.put("H", 5.0);
        MapG.put("I", 2.0);
        
        Map<String, Double> MapH = new HashMap<String,Double>();
        MapH.put("A", 13.0);
        MapH.put("B", 10.0);
        MapH.put("C", 7.0);
        MapH.put("D", 9.0);
        MapH.put("E", 11.0);
        MapH.put("F", 3.0);
        MapH.put("G", 5.0);
        MapH.put("H", 0.0);
        MapH.put("I", 4.0);
        
        Map<String, Double> MapI = new HashMap<String,Double>();
        MapI.put("A", 15.0);
        MapI.put("B", 14.0);
        MapI.put("C", 15.0);
        MapI.put("D", 11.0);
        MapI.put("E", 9.0);
        MapI.put("F", 7.0);
        MapI.put("G", 2.0);
        MapI.put("H", 4.0);
        MapI.put("I", 0.0);
        
        heuristic.put("A", MapA);
        heuristic.put("B", MapB);
        heuristic.put("C", MapC);
        heuristic.put("D", MapD);
        heuristic.put("E", MapE);
        heuristic.put("F", MapF);
        heuristic.put("G", MapG);
        heuristic.put("H", MapH);
        heuristic.put("I", MapI);
        
        GraphAStar<String> graph = new GraphAStar<String>(heuristic);
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");
        graph.addNode("H");
        graph.addNode("I");
        
        
        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "C", 3);
        graph.addEdge("A", "D", 5);
        graph.addEdge("B", "E", 4);
        graph.addEdge("C", "F", 2);
        graph.addEdge("D", "E", 3);
        graph.addEdge("D", "F", 3);
        graph.addEdge("E", "G", 2);
        graph.addEdge("F", "H", 3);
        graph.addEdge("G", "H", 5);
        graph.addEdge("G", "I", 2);
        
        

        
        AStar<String> aStar = new AStar<String>(graph);
        for(String path : aStar.Astar("A", "I")){
            System.out.println(path);
        }
    } 
}
