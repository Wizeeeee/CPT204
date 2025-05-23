public class MyPointTest {
    public static void main(String[] args) {
        // 创建三个点
        MyPoint p1 = new MyPoint(); // (0.0, 0.0)
        MyPoint p2 = new MyPoint(10.25, 20.8);
        MyPoint p3 = new MyPoint(13.25, 24.8);

        // 使用实例方法计算距离
        System.out.println("p1到p2的距离（实例方法）: " + p1.distance(p2));
        System.out.println("p1到p3的距离（实例方法）: " + p1.distance(p3));
        System.out.println("p2到p3的距离（实例方法）: " + p2.distance(p3));

        // 使用静态方法计算距离
        System.out.println("p1到p2的距离（静态方法）: " + MyPoint.distance(p1, p2));
        System.out.println("p1到p3的距离（静态方法）: " + MyPoint.distance(p1, p3));
        System.out.println("p2到p3的距离（静态方法）: " + MyPoint.distance(p2, p3));
    }
}
