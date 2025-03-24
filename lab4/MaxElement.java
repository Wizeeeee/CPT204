package lab4;
 

import java.util.ArrayList;  

public class MaxElement {  

    // 泛型方法，接受一个 ArrayList<E>，E 必须实现 Comparable 接口  
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {  
        // 假设第一个元素是最大的  
        if (list == null || list.isEmpty()) {  
            throw new IllegalArgumentException("列表不能为空");  
        }  
        
        E maxElement = list.get(0);  // 初始化 maxElement 为列表的第一个元素  
        
        // 遍历列表，找到最大元素  
        for (E element : list) {  
            if (element.compareTo(maxElement) > 0) {  
                maxElement = element;  // 更新 maxElement  
            }  
        }  
        
        return maxElement;  
    }  

    public static void main(String[] args) {  
        // 创建一个存储 Integer 的 ArrayList  
        ArrayList<Integer> numbers = new ArrayList<>();  
        numbers.add(1);  
        numbers.add(5);  
        numbers.add(3);  
        numbers.add(9);  
        numbers.add(2);  

        // 输出最大元素  
        Integer maxNumber = max(numbers);  
        System.out.println("最大元素: " + maxNumber);  
    }  
}  