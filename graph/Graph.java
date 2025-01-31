import java.util.*;

class Graph {
    private List<Integer> resBFS;
    private List<Integer> resDFS=new ArrayList<>();
    private int vertices;
    static List<List<Integer>> adj;
    int[][] adjmatrix;// [N][N] for 0 based and [N+1][N+1] for 1 based

    Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();
        adjmatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);// Example:[0][1]
        adj.get(v).add(u);// Example:[1][0]
        adjmatrix[u][v] = 1;
        adjmatrix[v][u] = 1;
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[vertices + 1];
        Queue<Integer> q = new LinkedList<>();
        resBFS = new ArrayList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            // System.out.print(curr+" ");
            resBFS.add(curr);
            for (int neighbour : adj.get(curr)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
    }

    void dfs(int start, boolean[] visited) {
        visited[start] = true;
        resDFS.add(start);
        for (int neighbour : adj.get(start))
            if (!visited[neighbour])
                dfs(neighbour, visited);
    }

    public void displaylist() {
        System.out.print(adj);
        System.out.print(resBFS);
        System.out.print(resDFS);
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.BFS(0);
        boolean visited[] = new boolean[5];
        g.dfs(0, visited);
        g.displaylist();
    }
}
