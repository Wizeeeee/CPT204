package Lab10;

public class GraphUtils {

    /**
     * 生成邻接矩阵
     * @param edges 二维数组，存储所有边的信息：{startVertex, endVertex, weight}
     * @param numVertices 顶点总数
     * @return 加权邻接矩阵
     */
    public static Double[][] getAdjacentMatrix(int[][] edges, int numVertices) {
        Double[][] matrix = new Double[numVertices][numVertices];
        
        // 初始化矩阵为null或无连接（用null表示无边）
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i != j) {
                    matrix[i][j] = null; // 表示没有直接连接
                } else {
                    matrix[i][j] = 0.0; // 自己到自己为0
                }
            }
        }
        
        // 填充边的权重
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            double weight = edge[2];
            matrix[u][v] = weight;
            matrix[v][u] = weight; // 无向图，双向邻接
        }
        
        return matrix;
    }
    
    public static void main(String[] args) {
        // 测试用例：边的定义 {起点, 终点, 权重}
        int[][] edges = {
            {0, 1, 4},
            {0, 2, 3},
            {1, 2, 1},
            {1, 3, 2},
            {2, 3, 4},
            {3, 4, 2}
        };
        int numVertices = 5;
        Double[][] adjMatrix = getAdjacentMatrix(edges, numVertices);
        
        // 打印邻接矩阵
        for (Double[] row : adjMatrix) {
            for (Double val : row) {
                System.out.print((val == null ? "null" : val) + "\t");
            }
            System.out.println();
        }
    }
}
