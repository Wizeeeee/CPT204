import java.util.*;

public class WeightedGraph<V> {
    private List<V> vertices = new ArrayList<>();
    private List<List<Edge>> neighbors = new ArrayList<>();

    public WeightedGraph(V[] vertices, int[][] edges) {
        for (V vertex : vertices) {
            addVertex(vertex);
        }
        createAdjacencyLists(edges, vertices.length);
    }

    public WeightedGraph(int[][] edges, int numberOfVertices) {
        for (int i = 0; i < numberOfVertices; i++) {
            addVertex((V) Integer.valueOf(i)); // 假设顶点是整数
        }
        createAdjacencyLists(edges, numberOfVertices);
    }

    private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
        for (int i = 0; i < numberOfVertices; i++) {
            neighbors.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            addEdge(edge[0], edge[1], edge[2]);
        }
    }

    public void addVertex(V vertex) {
        vertices.add(vertex);
        neighbors.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, double weight) {
        neighbors.get(u).add(new Edge(u, v, weight));
    }

    public int getIndex(V vertex) {
        return vertices.indexOf(vertex);
    }

    public ShortestPathTree getShortestPath(int sourceIndex) {
        double[] cost = new double[vertices.size()];
        int[] parent = new int[vertices.size()];
        Arrays.fill(cost, Double.POSITIVE_INFINITY);
        Arrays.fill(parent, -1);
        cost[sourceIndex] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingDouble(e -> e.weight));
        pq.add(new Edge(sourceIndex, sourceIndex, 0));

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.v;

            for (Edge e : neighbors.get(u)) {
                if (cost[u] + e.weight < cost[e.v]) {
                    cost[e.v] = cost[u] + e.weight;
                    parent[e.v] = u;
                    pq.add(new Edge(e.u, e.v, cost[e.v]));
                }
            }
        }

        return new ShortestPathTree(sourceIndex, parent, cost);
    }

    public class ShortestPathTree {
        private int source;
        private int[] parent;
        private double[] cost;

        public ShortestPathTree(int source, int[] parent, double[] cost) {
            this.source = source;
            this.parent = parent;
            this.cost = cost;
        }

        public void printAllPaths() {
            for (int i = 0; i < vertices.size(); i++) {
                if (i != source) {
                    System.out.print("Path from " + vertices.get(source) + " to " + vertices.get(i) + ": ");
                    List<V> path = getPath(i);
                    if (path.isEmpty()) {
                        System.out.println("No path");
                    } else {
                        for (V vertex : path) {
                            System.out.print(vertex + " ");
                        }
                        System.out.println("(cost: " + cost[i] + ")");
                    }
                }
            }
        }

        public List<V> getPath(int index) {
            List<V> path = new ArrayList<>();
            for (int i = index; i != -1; i = parent[i]) {
                path.add(vertices.get(i));
            }
            Collections.reverse(path);
            return path;
        }
    }

    private static class Edge {
        int u, v;
        double weight;

        public Edge(int u, int v, double weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
}