package Lab6;

import java.util.HashMap;  
import java.util.Map;  
import java.util.Scanner;  
import java.util.ArrayList;  

public class MostFrequentNumbers {  
    public static void main(String[] args) {  
        // 创建一个扫描器用于读取用户输入  
        Scanner scanner = new Scanner(System.in);  
        Map<Integer, Integer> countMap = new HashMap<>();  
        
        // 读取整数输入，直到用户输入 0  
        System.out.println("Enter integers (0 to stop):");  
        while (true) {  
            int number = scanner.nextInt();  
            if (number == 0) {  
                break; // 输入 0，结束输入  
            }  
            
            // 更新数字出现次数  
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);  
        }  
        
        // 找到最大出现次数  
        int maxCount = 0;  
        for (int count : countMap.values()) {  
            if (count > maxCount) {  
                maxCount = count;  
            }  
        }  

        // 收集所有出现最大次数的数字  
        ArrayList<Integer> mostFrequentNumbers = new ArrayList<>();  
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {  
            if (entry.getValue() == maxCount) {  
                mostFrequentNumbers.add(entry.getKey());  
            }  
        }  

        // 输出出现次数最多的数字  
        System.out.println("Number(s) that occurred the most (" + maxCount + " times): " + mostFrequentNumbers);  
        scanner.close(); // 关闭扫描器  
    }  
}  
