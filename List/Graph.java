package GeeksSS;
import java.io.*;
import java.util.*;

public class Graph {
	private int V;
	private LinkedList<Integer> adj[];
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; ++i)
			adj[i] = new LinkedList(); 
	}
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	void BFS(int s){
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while(queue.size() != 0){
			s = queue.poll();
			System.out.println(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
		}
	}
	public static void main(String[] args) {
		

	}

}
