package lecture4;

public class GenericSelectionSort {  

    // 泛型选择排序方法  
    public static <E extends Comparable<E>> void genericSelectionSort(E[] list) {  
        E currentMin;  // 当前最小值  
        int currentMinIndex;  // 当前最小值索引  

        // 外层循环遍历数组  
        for (int i = 0; i < list.length - 1; i++) {  
            // 假设当前元素为最小值  
            currentMin = list[i];  
            currentMinIndex = i;  

            // 内层循环找到最小值  
            for (int j = i + 1; j < list.length; j++) {  
                if (currentMin.compareTo(list[j]) > 0) {  
                    currentMin = list[j];  
                    currentMinIndex = j;  
                }  
            }  

            // 如果找到的最小值不是当前位置的值，进行交换  
            if (currentMinIndex != i) {  
                list[currentMinIndex] = list[i];  
                list[i] = currentMin;  
            }  
        }  
    }  

    // 主方法，用于测试排序  
    public static void main(String[] args) {  
        // 创建一个样例数组  
        Integer[] intArray = {64, 25, 12, 22, 11};  
        
        // 调用选择排序方法  
        genericSelectionSort(intArray);  
        
        // 打印排序后的数组  
        System.out.print("Sorted array: ");  
        for (Integer num : intArray) {  
            System.out.print(num + " ");  
        }  
        System.out.println();  
        
        // 创建一个字符串数组  
        String[] strArray = {"Banana", "Apple", "Orange", "Mango"};  

        // 调用选择排序方法  
        genericSelectionSort(strArray);  
        
        // 打印排序后的字符串数组  
        System.out.print("Sorted string array: ");  
        for (String str : strArray) {  
            System.out.print(str + " ");  
        }  
    }  
}  