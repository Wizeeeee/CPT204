package lab5;

import java.util.Stack;  
import java.util.Scanner;  

public class GroupingSymbolsChecker {  
    public static void main(String[] args) {  
        // 创建 Scanner 对象以获取用户的输入  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("请输入程序源代码行: ");  
        String input = scanner.nextLine();  
        
        // 检查分组符号是否成对  
        if (areGroupingSymbolsPaired(input)) {  
            System.out.println("输出: Paired");  
        } else {  
            System.out.println("输出: Unpaired");  
        }  
        
        // 关闭 Scanner  
        scanner.close();  
    }  

    // 检查分组符号是否成对  
    private static boolean areGroupingSymbolsPaired(String input) {  
        // 使用栈来跟踪分组符号  
        Stack<Character> stack = new Stack<>();  

        // 遍历输入的每一个字符  
        for (char ch : input.toCharArray()) {  
            // 如果字符是开括号，则推入栈中  
            if (ch == '(' || ch == '{' || ch == '[') {  
                stack.push(ch);  
            }  
            // 如果字符是闭括号，检查栈的顶部  
            else if (ch == ')' || ch == '}' || ch == ']') {  
                // 如果栈空，说明没有对应的开括号，返回 false  
                if (stack.isEmpty()) {  
                    return false;  
                }  
                // 检查顶部的开括号是否与当前闭括号匹配  
                char top = stack.pop();  
                if (!isMatchingPair(top, ch)) {  
                    return false;  
                }  
            }  
        }  

        // 如果栈为空，说明所有分组符号都成对  
        return stack.isEmpty();  
    }  

    // 检查一对分组符号是否匹配  
    private static boolean isMatchingPair(char open, char close) {  
        return (open == '(' && close == ')') ||   
               (open == '{' && close == '}') ||   
               (open == '[' && close == ']');  
    }  
}  
