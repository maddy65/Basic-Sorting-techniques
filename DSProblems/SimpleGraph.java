package com.geeks.ds.graph.basics;

import java.util.LinkedList;

public class SimpleGraph {
	static class Graph{
		int V;
		LinkedList<Integer> adjListArray[];
		
		Graph(int V){
			this.V = V;
			
			adjListArray = new LinkedList[V];
			
			for(int i=0; i<V; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge (Graph graph, int src, int dist) {
		graph.adjListArray[src].add(dist);
		graph.adjListArray[dist].add(src);
	}
	
	static void printGraph(Graph graph) {
		for(int i=0; i<graph.V; i++) {
			System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjListArray[i]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
		}
	}
	
	public static void main(String args[]) 
    { 
        int V = 5; 
        Graph graph = new Graph(V); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        printGraph(graph); 
    } 

}
