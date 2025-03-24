package lab5;

import java.util.PriorityQueue;  

public class PriorityQueueOperations {  
    public static void main(String[] args) {  
        // Create the first priority queue  
        PriorityQueue<String> queue1 = new PriorityQueue<>();  
        queue1.add("George");  
        queue1.add("Jim");  
        queue1.add("John");  
        queue1.add("Blake");  
        queue1.add("Kevin");  
        queue1.add("Michael");  

        // Create the second priority queue  
        PriorityQueue<String> queue2 = new PriorityQueue<>();  
        queue2.add("George");  
        queue2.add("Katie");  
        queue2.add("Kevin");  
        queue2.add("Michelle");  
        queue2.add("Ryan");  

        // Union of the two priority queues  
        PriorityQueue<String> unionQueue = new PriorityQueue<>(queue1);  
        unionQueue.addAll(queue2);  
        System.out.println("Union: " + unionQueue);  

        // Difference of the two priority queues (queue1 - queue2)  
        PriorityQueue<String> differenceQueue = new PriorityQueue<>(queue1);  
        differenceQueue.removeAll(queue2);  
        System.out.println("Difference (queue1 - queue2): " + differenceQueue);  

        // Intersection of the two priority queues  
        PriorityQueue<String> intersectionQueue = new PriorityQueue<>(queue1);  
        intersectionQueue.retainAll(queue2);  
        System.out.println("Intersection: " + intersectionQueue);  
    }  
}  