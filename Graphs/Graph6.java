package Graphs;
import java.util.*;

public class Graph6{
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    //Topological Sort Using BFS

    //Kahn's Algorithm
    //In-Degre: (no of incoming edges to the node)
    //Out-Degree: (no of outgoing edges from the node)

    //Approach(In-Degree):
    //Fact: A DAG(Directed Acyclic Graph) has at least one vertex with in-degree 0 and one vertex without degree 0

    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calcIndeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){//Indegree 0 => Add in the queue
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");//topological sort print

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    //O(V^V) => worst case Complexity for all paths in graph.
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src == dest){
            System.out.println(path+dest+" ");
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src+" ");
        }
    }

    public static void main(String[] args){
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
       // topSort(graph);

       int src = 5, dest = 1;
       printAllPath(graph,src,dest,"");
    }
}