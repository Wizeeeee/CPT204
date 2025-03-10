 package Lab3;
import java.util.ArrayList;  
import java.util.Random;  

public class ShuffleList {  

    public static void shuffle(ArrayList<Number> list) {  
        Random random = new Random(); // 创建 Random 对象，避免每次循环都创建  

        for (int i = list.size() - 1; i > 0; i--) {  
            // 3. 生成随机索引  
            int randomIndex = random.nextInt(i + 1);  // 生成 0 到 i 之间的随机整数  

            // 4. 交换元素  
            Number temp = list.get(i);  
            list.set(i, list.get(randomIndex));  
            list.set(randomIndex, temp);  
        }  
    }  

    public static void main(String[] args) {  
        // 1. 创建 ArrayList  
        ArrayList<Number> numbers = new ArrayList<>();  
        numbers.add(1);  
        numbers.add(2);  
        numbers.add(3);  
        numbers.add(4);  
        numbers.add(5);  

        System.out.println("原始列表: " + numbers);  

        // 调用 shuffle 方法  
        shuffle(numbers);  

        System.out.println("洗牌后的列表: " + numbers);  
    }  
}  