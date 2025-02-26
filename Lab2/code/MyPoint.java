public class MyPoint {  
    private double x; // x 坐标  
    private double y; // y 坐标  

    // 空构造函数，创建点 (0.0, 0.0)  
    public MyPoint() {  
        this.x = 0.0;  
        this.y = 0.0;  
    }  

    // 构造函数，使用指定的 x 和 y 坐标  
    public MyPoint(double x, double y) {  
        this.x = x;  
        this.y = y;  
    }  

    // 获取 x 坐标  
    public double getX() {  
        return x;  
    }  

    // 获取 y 坐标  
    public double getY() {  
        return y;  
    }  

    // 实例方法：计算当前点和另一个点之间的距离  
    public double distance(MyPoint other) {  
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));  
    }  

    // 静态方法：计算两个点之间的距离  
    public static double distance(MyPoint p1, MyPoint p2) {  
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));  
    }  
}