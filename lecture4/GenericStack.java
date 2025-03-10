package lecture4;

public class GenericStack<E> {  
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();  

    public int getSize() {  
        return list.size();  
    }  

    public E peek() {  
        return list.get(getSize() - 1);  
    }  

    public void push(E o) {  
        list.add(o);  
    }  

    public E pop() {  
        if (isEmpty()) {  
            return null; // 或者抛出一个异常，例如 EmptyStackException  
        }  
        return list.remove(getSize() - 1);  
    }  

    public boolean isEmpty() {  
        return list.isEmpty();  
    }  

    @Override  
    public String toString() {  
        return "stack: " + list.toString();  
    }  

    public static void main(String[] args) {  
        // 示例用法  
        GenericStack<Integer> intStack = new GenericStack<>();  
        intStack.push(1);  
        intStack.push(2);  
        intStack.push(3);  

        System.out.println(intStack.toString()); // 输出：stack: [1, 2, 3]  
        System.out.println("Size: " + intStack.getSize()); // 输出：Size: 3  
        System.out.println("Peek: " + intStack.peek()); // 输出：Peek: 3  
        System.out.println("Pop: " + intStack.pop()); // 输出：Pop: 3  
        System.out.println(intStack.toString()); // 输出：stack: [1, 2]  
        System.out.println("Is empty? " + intStack.isEmpty()); // 输出：Is empty? false  

        GenericStack<String> stringStack = new GenericStack<>();  
        stringStack.push("Hello");  
        stringStack.push("World");  

        System.out.println(stringStack.toString()); // 输出：stack: [Hello, World]  
    }  
}  