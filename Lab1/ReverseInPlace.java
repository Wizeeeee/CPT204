package Lab1;

import java.util.Scanner;

public class ReverseInPlace {
    /**
     * 原地反转数组
     * @param arr 要反转的数组
     */
    public static void reverseInPlace(double[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // 交换元素
            double temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入数组长度
        System.out.print("请输入数组元素个数：");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        // 提示用户输入数组元素
        System.out.println("请逐个输入 " + size + " 个数字：");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // 调用反转方法
        reverseInPlace(numbers);

        // 输出反转后的数组
        System.out.println("反转后的数组：");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
