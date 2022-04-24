package org.mitesh.ds.graphs;

import java.util.*;
/*
time complexity: O(V+E)
the same as BFS
 */

public class DFSGraph {
    private int vertices;
    private List<Integer> adj[];
    private Set<Integer> allVertices;// this contains the set of vertices
    public DFSGraph(int v){
        this.vertices = v;
        adj = new LinkedList[v];
        allVertices = new HashSet<>();
        for(int i = 0; i< v ; i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int x, int y){
        adj[x].add(y);
        allVertices.add(x);
        allVertices.add(y);
    }
    HashMap<Integer, Integer> parent = new HashMap<>();
    public void dfs_visit(int s){
        for( int v : adj[s]){
            if(!parent.containsKey(v)){
                parent.put(v, s);
                dfs_visit(v);
            }
        }
    }

    public void dfs(){
        for(int s : allVertices){
            if(!parent.containsKey(s)){
                parent.put(s, null);
                dfs_visit(s);
            }
        }
        System.out.println("parent of each vertices are :");
        System.out.println(parent);
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following DFS Traversal ");

        g.dfs();
    }

}
