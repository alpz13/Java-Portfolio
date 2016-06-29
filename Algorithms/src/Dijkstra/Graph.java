/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.*;

/**
 *
 * @author alex
 */
public class Graph {
    Map<String, Vertex>graph;
    
    public static class Edge{
        String v1, v2;
        int dist;
        public Edge(String v1, String v2, int dist){
            this.v1 = v1;
            this.v2 = v2;
            this.dist = dist;
        }
    }
    
    public static class Vertex implements Comparable<Vertex>{
        String name;
        int dist = Integer.MAX_VALUE;
        public Vertex previous = null;
        Map<Vertex, Integer> neighbours = new HashMap<>();
        
        public Vertex(String name){
            this.name = name;
        }
        
        private void printPath(){
            if(this == this.previous){
                System.out.printf("%s", this.name);
            } else if(this.previous == null){
                System.out.printf("%s(unreached)", this.name);
            } else {
                this.previous.printPath();
                System.out.printf(" -> %s(%d)", this.name, this.dist);
            }
        }
        
        public int compareTo(Vertex other){
            return Integer.compare(dist, other.dist);
        }
    }
    
    public Graph(Edge[] edges){
        graph = new HashMap<>(edges.length);
        
        for(Edge e: edges){
            if(!graph.containsKey(e.v1)){
                graph.put(e.v1, new Vertex(e.v1));
            }
            if(!graph.containsKey(e.v2)){
                graph.put(e.v2, new Vertex(e.v2));
            }
        }
        
        for(Edge e: edges){
            graph.get(e.v1).neighbours.put(graph.get(e.v2), e.dist);            
        }
    }
    
    public void dijkstra(String startName){
        if(!graph.containsKey(startName)){
            System.out.printf("Graph does not contain start vertex \"%s\"\n", startName);
            return;
        }
        Vertex source = graph.get(startName);
        NavigableSet<Vertex> q = new TreeSet<>();
        
        for(Vertex v : graph.values()){
            v.previous = v == source ? source : null;
            v.dist = v == source ? 0 : Integer.MAX_VALUE;
            q.add(v);
        }
        
        dijkstra(q);
    }
    
    private void dijkstra(NavigableSet<Vertex> q){
        Vertex u, v;
        while(!q.isEmpty()){
            u = q.pollFirst();
            if(u.dist == Integer.MAX_VALUE){
                break;
            }
            
            for(Map.Entry<Vertex, Integer> a : u.neighbours.entrySet()){
                v = a.getKey();
                int alternateDist = u.dist + a.getValue();
                if(alternateDist < v.dist){
                    q.remove(v);
                    v.dist = alternateDist;
                    v.previous = u;
                    q.add(v);
                }
            }
        }
    }
    
    public void printPath(String endName){
        if(!graph.containsKey(endName)){
            System.err.printf("Graph does not contain end vertex \"%s\"\n", endName);
            return;
        }
        
        graph.get(endName).printPath();
        System.out.println();
    }
    public void printAllPaths(){
        for(Vertex v : graph.values()){
            v.printPath();
            System.out.println();
        }
    }
    
}
