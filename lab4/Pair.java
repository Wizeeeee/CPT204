package lab4;

public class Pair<F, S> {  
    public F first; // First element  
    public S second; // Second element  

    // Constructor: a pair with two elements of potentially different types  
    public Pair(F f, S s) {  
        first = f;  
        second = s;  
    }  
    
    public static void print(Pair<?, ?> p) {  
        System.out.println(p.first + " " + p.second);  
    }  

    public static void main(String[] args) {  
        Pair<Integer, Double> p1 = new Pair<>(1, 85.5);  
        Pair<Integer, String> p2 = new Pair<>(2, "good");  
        print(p1);  
        print(p2);  
    }  
}  