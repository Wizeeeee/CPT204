import java.util.Date;  

public class Testhouse implements Cloneable, Comparable<Testhouse> {  
    private int id;  
    private double area;  
    private Date whenBuilt;  

    // 构造函数  
    public Testhouse(int id, double area) {  
        this.id = id;  
        this.area = area;  
        this.whenBuilt = new Date();  
    }  

    // 获取 id  
    public int getId() {  
        return id;  
    }  

    // 获取面积  
    public double getArea() {  
        return area;  
    }  

    // 获取建筑时间  
    public Date getWhenBuilt() {  
        return whenBuilt;  
    }  

    /** Override the protected clone method defined in the Object class */  
    @Override  
    public Object clone() {  
        try {  
            return super.clone();  
        } catch (CloneNotSupportedException ex) {  
            return null; // 理论上不会发生，因为该类实现了 Cloneable  
        }  
    }  

    /** Implement the compareTo method defined in Comparable */  
    @Override  
    public int compareTo(Testhouse o) {  
        if (this.area > o.area) {  
            return 1; // 当前对象的面积大于传入对象  
        } else if (this.area < o.area) {  
            return -1; // 当前对象的面积小于传入对象  
        } else {  
            return 0; // 两个对象的面积相等  
        }  
    }  

    // 重写 toString 方法以方便打印  
    @Override  
    public String toString() {  
        return "House [id=" + id + ", area=" + area + ", whenBuilt=" + whenBuilt + "]";  
    }  

    // 主方法  
    public static void main(String[] args) {  
        // 创建两个 House 对象  
        Testhouse house1 = new Testhouse(1, 150.0);  
        Testhouse house2 = new Testhouse(2, 200.0);  

        // 打印出两个 House 对象的信息  
        System.out.println(house1);  
        System.out.println(house2);  

        // 比较两个 House 对象  
        int comparisonResult = house1.compareTo(house2);  
        if (comparisonResult > 0) {  
            System.out.println("house1 is larger than house2.");  
        } else if (comparisonResult < 0) {  
            System.out.println("house1 is smaller than house2.");  
        } else {  
            System.out.println("house1 is equal in area to house2.");  
        }  

        // 克隆 house1  
        Testhouse clonedHouse = (Testhouse) house1.clone();  
        System.out.println("Cloned House: " + clonedHouse);  

        // 验证克隆的对象是否与原始对象相同  
        System.out.println("house1 == clonedHouse is " + (house1 == clonedHouse)); // false  
        System.out.println("house1.equals(clonedHouse) is " + house1.equals(clonedHouse)); // true  
    }  
}