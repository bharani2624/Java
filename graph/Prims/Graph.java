package Prims;
import java.util.*;


public class Graph {
    private List<List<Node>> adj;
    private int vertices;
    Graph(int vertices)
    {
        for(int i=0;i<vertices;i++)
        {
            adj.add(new ArrayList<>());
        }
    }
    static class Node
    {
        int vertex,weight;
        Node(int v,int w)
        {
            this.vertex=v;
            this.weight=w;
        }
    }
    void addEdge(int u,int v,int weight)
    {
        adj.get(u).add(new Node(v,weight));
        adj.get(v).add(new Node(u,weight));
    }
    void primMst()
    {
        boolean visited[]=new boolean[vertices];
        PriorityQueue<Node> pq=new PriorityQueue<>(Comparator.comparingInt(node ->node.weight));
        pq.offer(new Node(0,0));
        int totalCost=0;
        while(!pq.isEmpty())
        {
            Node curr=pq.poll();
            int currentNode=curr.vertex;
            int weight=curr.weight;
            if(visited[currentNode]) continue;
            visited[currentNode]=true;
            totalCost+=weight;
            for(Node node:adj.get(currentNode))
            {
                if(!visited[node.vertex])
                {
                    pq.offer(node);
                }
            }
        }

    }


}
