import java.util.ArrayList;  
import java.util.Scanner;  

public class MyStack extends ArrayList<Object> {  

    // 方法 1: 检查栈是否为空  
    public boolean isEmpty() {  
        return size() == 0; // 调用 ArrayList 的 size() 方法  
    }  

    // 方法 2: 获取栈的大小  
    public int getSize() {  
        return size(); // 直接返回 ArrayList 的大小  
    }  

    // 方法 3: 查看栈顶元素而不移除  
    public Object peek() {  
        if (isEmpty()) {  
            return null; // 如果栈为空，返回 null  
        }  
        return get(size() - 1); // 返回最后添加的元素  
    }  

    // 方法 4: 弹出栈顶元素并移除  
    public Object pop() {  
        if (isEmpty()) {  
            return null; // 如果栈为空，返回 null  
        }  
        return remove(size() - 1); // 移除并返回最后一个元素  
    }  

    // 方法 5: 压入新元素  
    public void push(Object o) {  
        add(o); // 直接调用 ArrayList 的 add() 方法  
    }  

    // 方法 6: 搜索元素，返回元素的位置  
    public int search(Object o) {  
        // 反向遍历以实现栈的搜索逻辑  
        for (int i = size() - 1; i >= 0; i--) {  
            if (get(i).equals(o)) {  
                return size() - i; // 返回相对栈顶的位置  
            }  
        }  
        return -1; // 如果没有找到，返回 -1  
    }  

    // 方法 7: 重写 toString() 方法  
    @Override  
    public String toString() {  
        // 创建一个字符串用于保存栈中的元素，反向显示（从栈顶到栈底）  
        StringBuilder sb = new StringBuilder();  
        for (int i = size() - 1; i >= 0; i--) {  
            sb.append(get(i)).append("\n");  
        }  
        return sb.toString(); // 返回字符串  
    }  
}