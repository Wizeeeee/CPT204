package lecture4;
public class wrapper {  
    public static void main(String[] args) {  
        Integer a = new Integer(1);  
        Integer b = new Integer(1);  

        System.out.println("a == b: " + (a == b)); // 输出: false  

        System.out.println("a.equals(b): " + a.equals(b)); // 输出: true  

        Integer c = 1; // 自动装箱  
        Integer d = 1; // 自动装箱  

        System.out.println("c == d: " + (c == d)); // 输出: true (因为 1 在缓存范围内)  

        Integer e = 200;  
        Integer f = 200;  

        System.out.println("e == f: " + (e == f)); // 输出: false (因为 200 超出了缓存范围)  
        System.out.println("e.equals(f): " + e.equals(f)); // 输出: true  
    }  
}  