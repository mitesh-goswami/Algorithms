package org.mitesh.ds.graphs;

import java.util.*;

/*
 i have added parent field in bfs bcoz if i have to do a single source shortest path
 algo from a particular vertex then i just have to recursively call the parent of that vertex
 until i have reached my source vertex.
 */

public class Graph {
    private int vertices;
    private List<Integer> adj[] ;

    public Graph(int v) {
        this.vertices = v;
        adj = new LinkedList[v];
        for(int i=0 ; i<v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int x, int y) {
        adj[x].add(y);
    }

    public void BFS(int s) {
        HashMap level = new HashMap<Integer, Integer>();
        level.put(s, 0);
        HashMap parent = new HashMap<Integer, Integer>();
        parent.put(s, null);
        int i=1;
        Queue<Integer>frontier = new ArrayDeque<Integer>();
        frontier.add(s);
        while(!frontier.isEmpty()) {
            Queue<Integer> next = new ArrayDeque<Integer>();
            for(int u : frontier) {
                for(int v : adj[u]) {
                    if(!level.containsKey(v)) {
                        level.put(v, i);
                        parent.put(v, u);
                        next.add(v);
                    }
                }
            }
            frontier = next;
            i++;
        }
        System.out.println("level of each index from "+ s+" vertex is :");
        System.out.println(level);
        System.out.println("parent of each index is : ");
        System.out.println(parent);
    }




    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        int s = 0;
        System.out.println("Following is BFS Traversal " + "(starting from "+ s +"th vertex)");

        g.BFS(s);
    }
}
