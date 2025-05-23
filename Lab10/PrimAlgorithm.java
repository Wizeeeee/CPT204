package Lab10;

import java.util.Arrays;

public class PrimAlgorithm {

    /**
     * 使用邻接矩阵实现 Prim's算法
     * @param graph 加权邻接矩阵
     * @return 最小生成树的边权重数组
     */
    public static double[] prim(Double[][] graph) {
        int numVertices = graph.length;
        double[] key = new double[numVertices]; // 存放每个点的最小边权
        boolean[] inMST = new boolean[numVertices]; // 是否已经包含在生成树
        int[] parent = new int[numVertices]; // 记录树边
        
        // 初始化
        Arrays.fill(key, Double.POSITIVE_INFINITY);
        key[0] = 0; // 从第0个顶点开始
        parent[0] = -1;
        
        for (int i = 0; i < numVertices; i++) {
            // 选择不在MST中的，key值最小的顶点
            int u = minKeyVertex(key, inMST);
            inMST[u] = true; // 加入MST
            
            // 更新相邻顶点的key值
            for (int v = 0; v < numVertices; v++) {
                if (graph[u][v] != null && !inMST[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }
        // 返回每个点到其父节点的边的权重
        return key;
    }
    
    // 找到key数组中最小的未加入MST的顶点
    private static int minKeyVertex(double[] key, boolean[] inMST) {
        double min = Double.POSITIVE_INFINITY;
        int minIndex = -1;
        for (int v = 0; v < key.length; v++) {
            if (!inMST[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        // 先生成邻接矩阵
        int[][] edges = {
            {0, 1, 4},
            {0, 2, 3},
            {1, 2, 1},
            {1, 3, 2},
            {2, 3, 4},
            {3, 4, 2}
        };
        int numVertices = 5;
        Double[][] adjMatrix = GraphUtils.getAdjacentMatrix(edges, numVertices);
        double[] mstEdges = prim(adjMatrix);
        
        System.out.println("每个节点到父节点的最小边权重：");
        System.out.println(Arrays.toString(mstEdges));
    }
}
