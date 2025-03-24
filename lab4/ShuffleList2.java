package lab4;


import java.util.ArrayList;  

public class ShuffleList2 {  

    // 泛型方法，接受一个 ArrayList<E>  
    public static <E> void shuffle(ArrayList<E> list) {  
        // 使用 Math.random() 生成随机索引  
        for (int i = list.size() - 1; i > 0; i--) {  
            // 生成 0 到 i 之间的随机整数  
            int randomIndex = (int) (Math.random() * (i + 1));  

            // 交换元素  
            E temp = list.get(i);  
            list.set(i, list.get(randomIndex));  
            list.set(randomIndex, temp);  
        }  
    }  

    public static void main(String[] args) {  
        // 创建一个存储 Integer 的 ArrayList  
        ArrayList<String> numbers = new ArrayList<>();  
        numbers.add("a");  
        numbers.add("b");  
        numbers.add("c");  
        numbers.add("d");  
        numbers.add("e");  

        System.out.println("原始列表: " + numbers);  

        // 调用 shuffle 方法  
        shuffle(numbers);  

        System.out.println("洗牌后的列表: " + numbers);  
    }  
}  