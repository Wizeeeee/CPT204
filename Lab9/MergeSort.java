package Lab9;

import java.util.Arrays;  
import java.util.Comparator;  

public class MergeSort {  

    // 使用 Comparable 接口的合并排序  
    public static <E extends Comparable<E>> void mergeSort(E[] array) {  
        if (array.length < 2) {  
            return; // 基本情况：数组长度小于2，不需要排序  
        }  

        int mid = array.length / 2;  
        E[] left = Arrays.copyOfRange(array, 0, mid); // 分割左半部分  
        E[] right = Arrays.copyOfRange(array, mid, array.length); // 分割右半部分  

        mergeSort(left);  // 递归排序左半部分  
        mergeSort(right); // 递归排序右半部分  

        merge(array, left, right); // 合并两个已排序的部分  
    }  

    private static <E extends Comparable<E>> void merge(E[] array, E[] left, E[] right) {  
        int i = 0, j = 0, k = 0;  

        // 合并两个数组  
        while (i < left.length && j < right.length) {  
            if (left[i].compareTo(right[j]) <= 0) {  
                array[k++] = left[i++];  
            } else {  
                array[k++] = right[j++];  
            }  
        }  

        // 处理剩余元素  
        while (i < left.length) {  
            array[k++] = left[i++];  
        }  
        while (j < right.length) {  
            array[k++] = right[j++];  
        }  
    }  

    // 使用 Comparator 接口的合并排序  
    public static <E> void mergeSort(E[] array, Comparator<? super E> comparator) {  
        if (array.length < 2) {  
            return; // 基本情况：数组长度小于2，不需要排序  
        }  

        int mid = array.length / 2;  
        E[] left = Arrays.copyOfRange(array, 0, mid); // 分割左半部分  
        E[] right = Arrays.copyOfRange(array, mid, array.length); // 分割右半部分  

        mergeSort(left, comparator);  // 递归排序左半部分  
        mergeSort(right, comparator); // 递归排序右半部分  

        merge(array, left, right, comparator); // 合并两个已排序的部分  
    }  

    private static <E> void merge(E[] array, E[] left, E[] right, Comparator<? super E> comparator) {  
        int i = 0, j = 0, k = 0;  

        // 合并两个数组  
        while (i < left.length && j < right.length) {  
            if (comparator.compare(left[i], right[j]) <= 0) {  
                array[k++] = left[i++];  
            } else {  
                array[k++] = right[j++];  
            }  
        }  

        // 处理剩余元素  
        while (i < left.length) {  
            array[k++] = left[i++];  
        }  
        while (j < right.length) {  
            array[k++] = right[j++];  
        }  
    }  

    public static void main(String[] args) {  
        Integer[] array1 = {3, 5, 1, 4, 2};  
        String[] array2 = {"banana", "apple", "orange", "mango"};  

        // 使用 Comparable 接口排序  
        mergeSort(array1);  
        System.out.println("Sorted Integer array: " + Arrays.toString(array1));  

        // 使用 Comparator 接口排序  
        mergeSort(array2, Comparator.naturalOrder());  
        System.out.println("Sorted String array: " + Arrays.toString(array2));  
    }  
}  