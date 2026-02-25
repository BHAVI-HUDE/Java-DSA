package Graphs;

import java.util.*;

public class Graph3{
    static class Edge {
        int src;
        int dest;
        

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    
    static void createGraph(ArrayList<Edge> graph []){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        //graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        //graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        
    }
    //O(V+E)
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean [graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]) {
               if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                    //cycle exists in one of the parts
               } 
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case3
            if(!vis[e.dest]){
                if( detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            //case1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            //case 2 do nothing => continue;
        }
        return false;
    }


    // BIPARTITE GRAPH
    // A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V such that every edge
    // (u, v) either connects a vertex from U to V or a vertex from V to U. In other words, for every edge (u, v), either u
    // belongs to U and v to V, or u belongs to V and v to U. We can also say that there is no edge that connects vertices of
    // same set.

    // SPECIAL CASES: 
    // 1.If graph doesn't have cycle => TRUE (BIPARTITE GRAPH)
    // 2.Cycle with EVEN no of nodes => TRUE
    // 3.Cycle with ODD no of nodes  => FALSE

    // Method 2 other than below function for Bipartite =>
    // Implement detect cycle on the graph with counting the no of nodes. 
    // If the no of nodes is even and is cyclic => Bipartite
    // If the no of nodes are odd or is not cyclic => Non Bipartite Graph
    
    
    //O(V+E)
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i=0; i<col.length; i++){
            col[i] = -1; //no color
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){ //BFS
                q.add(i);
                col[i] = 0; //yellow
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j); //e.dest
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if(col[e.dest] == col[curr]){
                            return false; //Not bipartite
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
        int V=5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));

    }
}