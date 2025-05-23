package Lab11;

import java.util.Stack;
// Preorder
public class Preorder {
    private Node root;

    public void nonRecursivePreorder() {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.element + " "); // 访问
            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }
    
    // Assuming Node class is defined as follows:
    private static class Node {
        int element;
        Node left, right;
        Node(int element) {
            this.element = element;
        }
    }
}
