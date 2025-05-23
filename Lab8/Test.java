package Lab8;
public class Test {  

    // O(n) time complexity method  
    public int sumRange(int n1, int n2) {  
        int sum = 0;  // Initialize sum to 0  
        for (int i = n1; i <= n2; i++) {  // Iterate from n1 to n2  
            sum += i;  // Add the current number to sum  
        }  
        return sum;  // Return the computed sum  
    }  

    // O(1) time complexity method  
    public int sumRange1(int n1, int n2) {  
        return sum(n2) - sum(n1 - 1);  // Using the sum of first n natural numbers  
    }  

    // Helper method to calculate the sum of the first n natural numbers  
    private int sum(int n) {  
        return n * (n + 1) / 2;  // Sum formula  
    }  

    public static void main(String[] args) {  
        Test test = new Test();  // Instantiate the Test class  

        int n1 = 1;  // Starting number  
        int n2 = 10;  // Ending number  

        // Calling the O(n) method  
        System.out.println("O(n) Sum from " + n1 + " to " + n2 + " is: " + test.sumRange(n1, n2));  

        // Calling the O(1) method  
        System.out.println("O(1) Sum from " + n1 + " to " + n2 + " is: " + test.sumRange1(n1, n2));  
    }  
}  