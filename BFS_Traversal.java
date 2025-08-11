//BFS_Traversal.java
import java.util.*;

public class BFS_Traversal {

    // Graph representation using adjacency list
    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        // Add edge to the graph (undirected)
        public void addEdge(int src, int dest) {
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.putIfAbsent(dest, new ArrayList<>());

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }

        // BFS traversal
        public void bfs(int start) {
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();

            visited.add(start);
            queue.offer(start);

            System.out.print("BFS Traversal: ");
            while (!queue.isEmpty()) {
                int node = queue.poll();
                System.out.print(node + " ");

                for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        // Adding edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        // Start BFS from node 0
        g.bfs(0);
    }
}
