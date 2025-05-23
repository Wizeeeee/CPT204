package Lab10;
import java.util.*;  

public class Graph {  
    private int V; // 顶点数量  
    private List<List<Integer>> adj; // 邻接表  

    public Graph(int v) {  
        V = v;  
        adj = new ArrayList<>(v);  
        for (int i = 0; i < v; i++) {  
            adj.add(new ArrayList<>());  
        }  
    }  

    // 添加边  
    public void addEdge(int u, int v) {  
        adj.get(u).add(v);  
        adj.get(v).add(u);  
    }  

    // 检查图是否为二分图  
    public boolean isBipartite() {  
        int[] color = new int[V];  
        Arrays.fill(color, -1); // -1 表示尚未着色  

        for (int start = 0; start < V; start++) {  
            if (color[start] == -1) { // 如果尚未着色，则执行 BFS  
                Queue<Integer> queue = new LinkedList<>();  
                queue.offer(start);  
                color[start] = 0; // 着色为 0  

                while (!queue.isEmpty()) {  
                    int node = queue.poll();  
                    for (int neighbor : adj.get(node)) {  
                        if (color[neighbor] == -1) { // 如果相邻顶点尚未着色  
                            // 着色为相反颜色  
                            color[neighbor] = 1 - color[node];  
                            queue.offer(neighbor);  
                        } else if (color[neighbor] == color[node]) {  
                            // 如果相邻顶点颜色与当前顶点相同，图不是二分图  
                            return false;  
                        }  
                    }  
                }  
            }  
        }  
        return true; // 图是二分图  
    }  
}  