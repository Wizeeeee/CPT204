package Lab6;

public class LargestNumberFinder {  

    // 主方法  
    public static void main(String[] args) {  
        int[] numbers = {178, 33, 4, 2, -3, 5};  
        int largestNumber = findLargestNumber(numbers, 0, numbers.length - 1);  
        System.out.println("最大的数字是: " + largestNumber);  
    }  

    // 查找最大值的递归方法  
    public static int findLargestNumber(int[] arr, int left, int right) {  
        // 基准情况：如果只有一个元素，返回该元素  
        if (left == right) {  
            return arr[left];  
        }  

        // 基准情况：如果有两个元素，比较并返回最大的一个  
        if (right - left == 1) {  
            return Math.max(arr[left], arr[right]);  
        }  

        // 计算中间索引  
        int mid = left + (right - left) / 2;  

        // 递归查找左半部分和右半部分的最大值  
        int leftMax = findLargestNumber(arr, left, mid);  
        int rightMax = findLargestNumber(arr, mid + 1, right);  

        // 返回两个最大值中的较大者  
        return Math.max(leftMax, rightMax);  
    }  
}  