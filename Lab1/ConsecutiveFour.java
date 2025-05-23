package Lab1;

import java.util.Scanner;

public class ConsecutiveFour {
    /**
     * 检查数组是否有连续四个相同的数字
     * @param values 输入的整数数组
     * @return 如果有连续四个相同的数字，返回true，否则false
     */
    public static boolean isConsecutiveFour(int[] values) {
        if (values == null || values.length < 4) {
            return false;
        }
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && 
                values[i + 1] == values[i + 2] && 
                values[i + 2] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入序列长度
        System.out.print("请输入数字序列的长度：");
        int size = scanner.nextInt();

        int[] series = new int[size];

        // 提示用户逐个输入数字
        System.out.println("请逐个输入" + size + "个整数：");
        for (int i = 0; i < size; i++) {
            series[i] = scanner.nextInt();
        }

        // 检查是否有连续四个相同数字
        boolean hasConsecutiveFour = isConsecutiveFour(series);

        // 输出结果
        if (hasConsecutiveFour) {
            System.out.println("序列中有连续四个相同的数字。");
        } else {
            System.out.println("序列中没有连续四个相同的数字。");
        }

        scanner.close();
    }
}