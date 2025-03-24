package lab5;
import java.util.LinkedList;  
import java.util.ListIterator;  

public class LinkedListTraversal {  
    public static void main(String[] args) {  
        // Step 1: Create a LinkedList containing 100,000 Integer objects  
        LinkedList<Integer> linkedList = new LinkedList<>();  
        for (int i = 0; i < 100000; i++) {  
            linkedList.add(i); // Adding Integer objects to the LinkedList  
        }  

        // Step 2: Create a timer using System.currentTimeMillis() for get() method traversal  
        long startTime = System.currentTimeMillis();  
        for (int i = 0; i < linkedList.size(); i++) {  
            linkedList.get(i); // Traversing using get()  
        }  
        long endTime = System.currentTimeMillis();  
        long getTime = endTime - startTime; // Time consumed for get() traversal  

        // Step 3: Create a timer for iterator traversal  
        startTime = System.currentTimeMillis();  
        ListIterator<Integer> iterator = linkedList.listIterator();  
        while (iterator.hasNext()) {  
            iterator.next(); // Traversing using iterator  
        }  
        endTime = System.currentTimeMillis();  
        long iteratorTime = endTime - startTime; // Time consumed for iterator traversal  

        // Step 4: Output the time values  
        System.out.println("Time taken using get(): " + getTime + " milliseconds");  
        System.out.println("Time taken using iterator: " + iteratorTime + " milliseconds");  
    }  
}  