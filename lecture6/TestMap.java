package lecture6;

import java.util.HashMap;  
import java.util.Map;  
import java.util.TreeMap;  
import java.util.LinkedHashMap;  

public class TestMap {  
    public static void main(String[] args) {  
        // 创建 HashMap  
        Map<String, Integer> hashMap = new HashMap<>();  
        hashMap.put("Smith", 30);  
        hashMap.put("Anderson", 31);  
        hashMap.put("Lewis", 29);  
        hashMap.put("Cook", 29);  
        System.out.println("Display entries in HashMap: " + hashMap);  

        // 创建 TreeMap  
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);  
        System.out.println("Display entries in ascending order of key: " + treeMap);  

        // 创建 LinkedHashMap  
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);  
        linkedHashMap.put("Smith", 30);  
        linkedHashMap.put("Anderson", 31);  
        linkedHashMap.put("Lewis", 29);  
        linkedHashMap.put("Cook", 29);  
        System.out.println("Display before any access: " + linkedHashMap);  
        
        // 访问元素  
        System.out.println("The age for Lewis is " + linkedHashMap.get("Lewis"));  
        
        // 显示访问后的结果  
        System.out.println("After an element is accessed, the entries in LinkedHashMap are: " + linkedHashMap);  

        // 显示每个人的名称和年龄  
        linkedHashMap.forEach((name, age) -> System.out.println(name + " is " + age + " years old."));  
    }  
}  
