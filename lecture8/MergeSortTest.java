package lecture8;

public class MergeSortTest {  
    // 归并排序方法  
    public static void mergeSort(int[] list) {  
        if (list.length > 1) {  
            // 获取数组的前半部分  
            int[] firstHalf = new int[list.length / 2];  
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);  
            mergeSort(firstHalf); // 递归排序前半部分  

            // 获取数组的后半部分  
            int secondHalfLength = list.length - list.length / 2;  
            int[] secondHalf = new int[secondHalfLength];  
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);  
            mergeSort(secondHalf); // 递归排序后半部分  

            // 合并已排序的两部分  
            merge(firstHalf, secondHalf, list);  
        }  
    }  

    // 合并两个已排序的数组  
    public static void merge(int[] list1, int[] list2, int[] temp) {  
        int current1 = 0; // list1的当前索引  
        int current2 = 0; // list2的当前索引  
        int current3 = 0; // temp的当前索引  

        // 合并两个数组  
        while (current1 < list1.length && current2 < list2.length) {  
            if (list1[current1] < list2[current2]) {  
                temp[current3++] = list1[current1++];  
            } else {  
                temp[current3++] = list2[current2++];  
            }  
        }  

        // 将list1中剩余的元素复制到temp中  
        while (current1 < list1.length) {  
            temp[current3++] = list1[current1++];  
        }  

        // 将list2中剩余的元素复制到temp中  
        while (current2 < list2.length) {  
            temp[current3++] = list2[current2++];  
        }  
    }  

    // 主方法，程序入口  
    public static void main(String[] args) {  
        int size = 100000; // 数组大小  
        int[] a = new int[size]; // 创建整型数组  
        randomInitiate(a); // 随机初始化数组  

        long startTime = System.currentTimeMillis(); // 记录开始时间  
        mergeSort(a); // 执行归并排序  
        long endTime = System.currentTimeMillis(); // 记录结束时间  

        System.out.println((endTime - startTime) + "ms"); // 输出排序所用时间  
    }  

    // 随机初始化数组的方法  
    private static void randomInitiate(int[] a) {  
        for (int i = 0; i < a.length; i++) {  
            a[i] = (int) (Math.random() * a.length); // 填充随机数  
        }  
    }  
}  
