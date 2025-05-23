package Lab1;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];

        // 生成随机数数组
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(1000000); // 生成0到999999的随机数
        }

        // 创建StopWatch对象，开始计时
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // 选择排序
        selectionSort(numbers);

        // 停止计时
        stopwatch.stop();

        // 输出排序耗时
        System.out.println("排序用时（毫秒）：" + stopwatch.getElapsedTime());
    }

    // 选择排序方法
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // 最小值的索引
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
