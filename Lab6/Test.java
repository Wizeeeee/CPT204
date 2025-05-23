package Lab6;

import java.util.*;  

public class Test {  
    public static void main(String[] args) throws Exception {  
        TreeSet<String> set = new TreeSet<>();  
        set.add("Red");  
        set.add("Yellow");  
        set.add("Green");  
        set.add("Blue");  
        // 使用 lower() 返回小于 "Purple" 的最大元素  
        System.out.println(set.lower("Purple")); // 应该打印 "Blue"  
    }  
}  
