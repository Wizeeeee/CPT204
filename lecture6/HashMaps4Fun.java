package lecture6;

import java.util.HashMap;  
import java.util.Map;  
import java.util.Set;  

public class HashMaps4Fun {  
    public static void main(String[] args) {  
        // 创建 HashMap  
        Map<String, Integer> hashMap = new HashMap<>();  

        // 添加键值对  
        hashMap.put("One", 1);  
        hashMap.put("Two", 2);  
        hashMap.put("Three", 3);  

        // 检查是否包含某个键  
        System.out.println("Does hashMap contain key 'Two'? " + hashMap.containsKey("Two"));  

        // 检查是否包含某个值  
        System.out.println("Does hashMap contain value '3'? " + hashMap.containsValue(3));  

        // 获取所有键值对的视图  
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();  
        System.out.println("Entry set: " + entries);  
    }  
}  
