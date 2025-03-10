package lecture4;

public class wrap {  
    public static void main(String[] args) {  
        // 使用原始数据类型值构造 Integer 和 Double 对象  
        Integer intObj1 = new Integer(10);  
        Double doubleObj1 = new Double(3.14);  

        System.out.println("Integer object: " + intObj1);   // 输出: Integer object: 10  
        System.out.println("Double object: " + doubleObj1);  // 输出: Double object: 3.14  

        // 使用字符串构造 Integer 和 Double 对象  
        Integer intObj2 = new Integer("100");  
        Double doubleObj2 = new Double("2.718");  

        System.out.println("Integer object from string: " + intObj2); // 输出: Integer object from string: 100  
        System.out.println("Double object from string: " + doubleObj2); // 输出: Double object from string: 2.718  

        // 错误示例：无效的字符串格式  
        try {  
            Integer intObj3 = new Integer("abc"); // 这会抛出 NumberFormatException  
        } catch (NumberFormatException e) {  
            System.err.println("Error: Invalid string format for Integer");  
        }  

        try {  
            Double doubleObj3 = new Double("xyz"); // 这会抛出 NumberFormatException  
        } catch (NumberFormatException e) {  
            System.err.println("Error: Invalid string format for Double");  
        }  
    }  
}  
