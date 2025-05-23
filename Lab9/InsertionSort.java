package Lab9;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            // 插入排序：将当前元素插入到已排好序的部分
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];  // 元素后移
                j--;
            }
            array[j + 1] = key; // 插入到正确位置
        }
    }

    public static void main(String[] args) {
        // 测试整型数组
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("排序前:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(intArray);

        System.out.println("排序后:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 测试字符串数组
        String[] strArray = {"apple", "pear", "banana", "orange"};
        System.out.println("\n排序前:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        insertionSort(strArray);

        System.out.println("排序后:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}