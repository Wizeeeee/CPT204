package lab4;

import java.util.*;  

public class week4test1 {  
    public static void main(String[] args) {  
        ArrayList<Integer> c = new ArrayList<>();  
        c.add(3);  
        c.add(4);  
        c.add(12);  
        print(c);  
    }  

    // 将 ArrayList<Object> 改为 ArrayList<?>  
    public static void print(ArrayList<?> o) {  
        for (Object e : o) {  
            System.out.println(e);  
        }  
    }  
}  