
import java.util.ArrayList;  
import java.util.Scanner;  public class TestMyStack {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        MyStack stack = new MyStack();  

        // 提示用户输入 5 个字符串  
        System.out.println("请输入 5 个字符串：");  
        for (int i = 0; i < 5; i++) {  
            String input = scanner.nextLine();  
            stack.push(input); // 将输入的字符串压入栈  
        }  

        // 以相反的顺序输出字符串  
        System.out.println("输入的字符串逆序为：");  
        System.out.println(stack.toString());  

        scanner.close(); // 关闭扫描器  
    }  
}