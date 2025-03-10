package Lab3;

import java.util.ArrayList;  
import java.util.List;  

class MyStack implements Cloneable {  
    private List<Object> list = new ArrayList<>();  

    public boolean isEmpty() {  
        return list.isEmpty();  
    }  

    public int getSize() {  
        return list.size();  
    }  

    public Object peek() {  
        return list.get(getSize() - 1);  
    }  

    public Object pop() {  
        Object o = list.get(getSize() - 1);  
        list.remove(getSize() - 1);  
        return o;  
    }  

    public void push(Object o) {  
        list.add(o);  
    }  

    @Override  
    public Object clone() throws CloneNotSupportedException {  
        MyStack newStack = (MyStack) super.clone();  
        newStack.list = new ArrayList<>();  
        for (Object o : this.list) {  
            newStack.list.add(deepCopy(o));  
        }  
        return newStack;  
    }  

    private Object deepCopy(Object obj) {  
        // 这里需要根据对象的类型进行不同的深拷贝处理  
        // 对于基本类型，可以直接返回  
        if (obj instanceof Integer || obj instanceof Double || obj instanceof String || obj instanceof Boolean) {  
            return obj;  
        }  
        // 对于自定义对象，需要递归调用深拷贝方法  
        if (obj instanceof MyObject) {  
            return ((MyObject) obj).clone();  
        }  
        // 对于其他类型的对象，可以根据实际情况进行处理  
        // 如果对象不支持深拷贝，可以抛出异常  
        throw new UnsupportedOperationException("不支持深拷贝的对象类型：" + obj.getClass());  
    }  

    static class MyObject implements Cloneable {  
        private int value;  

        public MyObject(int value) {  
            this.value = value;  
        }  

        public int getValue() {  
            return value;  
        }  

        public void setValue(int value) {  
            this.value = value;  
        }  

        @Override  
        public Object clone() {  
            try {  
                return super.clone();  
            } catch (CloneNotSupportedException e) {  
                throw new AssertionError();  
            }  
            }  

            public static void main(String[] args) throws CloneNotSupportedException {  
            MyStack stack1 = new MyStack();  
            stack1.push(1);  
            stack1.push(2);  
            MyObject myObject = new MyObject(3);  
            stack1.push(myObject);  

            MyStack stack2 = (MyStack) stack1.clone();  

            // 修改 stack1 中的对象  
            myObject.setValue(4);  

            // 验证 stack2 中的对象是否被修改  
            System.out.println("Stack1:");
            List<Object> list1 = new ArrayList<>();
            while (!stack1.isEmpty()) {
                list1.add(stack1.pop());
            }
            for (Object obj : list1) {
                if (obj instanceof MyObject) {
                System.out.println(((MyObject) obj).getValue());
                } else {
                System.out.println(obj);
                }
            }

            System.out.println("Stack2:");
            List<Object> list2 = new ArrayList<>();
            while (!stack2.isEmpty()) {
                list2.add(stack2.pop());
            }
            for (Object obj : list2) {
                if (obj instanceof MyObject) {
                System.out.println(((MyObject) obj).getValue()); // 输出 3，说明 stack2 中的对象没有被修改，实现了深拷贝
                } else {
                System.out.println(obj);
                }
            }
            }  
        }
    }  
