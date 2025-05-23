package Lab9;
public class BubbleSort {  
    public static void main(String[] args) {  
        int[] array = {2, 9, 5, 4, 8, 1};  
        
        // Perform bubble sort  
        bubbleSort(array);  
        
        // Print the sorted array  
        for (int num : array) {  
            System.out.print(num + " ");  
        }  
    }  

    public static void bubbleSort(int[] array) {  
        int n = array.length;  
        boolean swapped;  

        for (int i = 0; i < n - 1; i++) {  
            swapped = false;  // Reset swapped flag for each pass  

            for (int j = 0; j < n - 1 - i; j++) {  
                if (array[j] > array[j + 1]) {  
                    // Swap array[j] and array[j + 1]  
                    int temp = array[j];  
                    array[j] = array[j + 1];  
                    array[j + 1] = temp;  
                    swapped = true; // Set swapped flag to true  
                }  
            }  

            // If no elements were swapped, the array is already sorted  
            if (!swapped) {  
                break;  
            }  
        }  
    }  
}  