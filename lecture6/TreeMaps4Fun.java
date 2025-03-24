package lecture6;

import java.util.TreeMap;  

public class TreeMaps4Fun {  
    public static void main(String[] args) {  
        // 创建 TreeMap  
        TreeMap<String, Integer> treeMap = new TreeMap<>();  

        // 添加键值对  
        treeMap.put("Apple", 3);  
        treeMap.put("Banana", 2);  
        treeMap.put("Cherry", 5);  

        // 获取第一个键  
        System.out.println("First key: " + treeMap.firstKey());  

        // 获取最后一个键  
        System.out.println("Last key: " + treeMap.lastKey());  

        // 获取指定键之前的所有键值对  
        System.out.println("Head map (up to 'Banana'): " + treeMap.headMap("Banana"));  

        // 获取指定键及其之后的所有键值对  
        System.out.println("Tail map (from 'Banana'): " + treeMap.tailMap("Banana"));  

        // 移除并返回第一个键值对  
        System.out.println("Polled first entry: " + treeMap.pollFirstEntry());  

        // 显示 TreeMap 中的当前内容  
        System.out.println("Current TreeMap: " + treeMap);  
    }  
}  