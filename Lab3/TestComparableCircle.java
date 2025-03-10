package Lab3;
class Circle {  
    private double radius;  

    public Circle(double radius) {  
        this.radius = radius;  
    }  

    public double getRadius() {  
        return radius;  
    }  

    public double getArea() {  
        return Math.PI * radius * radius;  
    }  
}  

// ComparableCircle 类  
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {  
    public ComparableCircle(double radius) {  
        super(radius); // 调用父类 Circle 的构造函数  
    }  

    @Override  
    public int compareTo(ComparableCircle other) {  
        double thisArea = this.getArea();  
        double otherArea = other.getArea();  

        if (thisArea > otherArea) {  
            return 1;  // 当前圆的面积大于另一个圆  
        } else if (thisArea < otherArea) {  
            return -1; // 当前圆的面积小于另一个圆  
        } else {  
            return 0;  // 两个圆的面积相等  
        }  
    }  
}  

// 测试类  
public class TestComparableCircle {  
    public static void main(String[] args) {  
        ComparableCircle circle1 = new ComparableCircle(5.0);  
        ComparableCircle circle2 = new ComparableCircle(10.0);  

        // 使用 compareTo 方法比较  
        int result = circle1.compareTo(circle2);  

        if (result > 0) {  
            System.out.println("circle1 的面积大于 circle2");  
        } else if (result < 0) {  
            System.out.println("circle1 的面积小于 circle2");  
        } else {  
            System.out.println("circle1 和 circle2 的面积相等");  
        }  

        // 或者，可以写一个 max 方法来找到较大的圆  
        ComparableCircle largerCircle = max(circle1, circle2);  
        System.out.println("较大的圆的半径是: " + largerCircle.getRadius());  
    }  

    // 一个简单的 max 方法  
    public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2) {  
        if (c1.compareTo(c2) > 0) {  
            return c1;  
        } else {  
            return c2;  
        }  
    }  
}  