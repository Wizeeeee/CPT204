// package Lab3;

// 当然，以下是根据上述问题修正后的代码示例，增强你的理解。

// ---

// ### 1. **修正接口 `Animal`**

// **【原始问题】**  
// 在接口中定义了：`String name;`，试图创建实例变量会报错。

// **【修正方案】**  
// - 使用抽象方法获取名字（常用做法）
// - 或定义成`public static final`常量（如静态常量）

// **【修正代码一：用抽象方法获取名字】**

// ```java
// public interface Animal {
//     String getName(); // 获取名字的方法
//     void makeSound();  // 发出叫声的方法
// }
// ```

// **【修正代码二：定义常量（不常用）】**

// ```java
// public interface Animal {
//     String NAME = "Animal"; // 静态常量
//     void makeSound();
// }
// ```

// ---

// ### 2. **修正接口 `MyInterface2`**

// **【原始问题】**  
// 在接口中定义了带方法体的`method3()`，这是不允许的（除非用Java 8的`default` 或 `static` 方法）。

// **【修正方案：使用`default`方法】**

// ```java
// public interface MyInterface2 {
//     void method1(); // 抽象方法
//     void method2(); // 抽象方法

//     // 用default实现方法，让接口可以提供实现
//     default void method3() {
//         System.out.println("Method 3 implementation");
//     }
// }
// ```

// ---

// ### 3. **修正抽象类 `MyClass`**

// **【原始问题）**  
// 抽象类不能用`new MyClass()`直接实例化。

// **【修正方案】**  

// - 定义抽象类
// - 创建具体子类实现，然后实例化子类

// **【示范代码】**

// ```java
// public abstract class MyClass {
//     public MyClass() {
//         System.out.println("Abstract class constructor");
//     }

//     // 如果有抽象方法，必须定义
//     public abstract void abstractMethod();
// }

// // 定义继承类实现抽象方法
// public class MySubClass extends MyClass {
//     @Override
//     public void abstractMethod() {
//         System.out.println("实现抽象方法");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MyClass obj = new MySubClass(); // 实例化子类对象
//     }
// }
// ```

// ---

// ### **总结：**

// - **接口**不能拥有实例变量，只能声明常量或抽象方法。
// - **接口中的方法**，除Java 8开始支持的`default`和`static`，普通接口不能有实现。
// - **抽象类**不能直接实例化，必须通过子类实现其抽象方法。
