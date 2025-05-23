package Lab11;

import java.util.Stack;
// Inorder
public class BST<E extends Comparable<E>> {
    private class Node {
        E element;
        Node left, right;
        Node(E e) {
            this.element = e;
        }
    }

    private Node root;

    // 非递归中序遍历
    public void nonRecursiveInorder() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left; // 走到最左
            }
            current = stack.pop(); // 弹出
            System.out.print(current.element + " "); // 访问
            current = current.right; // 转向右子树
        }
    }

    // 插入元素（简化）
    public void insert(E e) {
        root = insert(root, e);
    }
    private Node insert(Node node, E e) {
        if (node == null) return new Node(e);
        if (e.compareTo(node.element) < 0)
            node.left = insert(node.left, e);
        else
            node.right = insert(node.right, e);
        return node;
    }
}