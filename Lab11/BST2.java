package Lab11;

import java.util.*;

public class BST2<E extends Comparable<E>> {
    private class Node {
        E element;
        Node left, right;
        Node(E e) {
            this.element = e;
        }
    }

    private Node root;

    // 预序遍历迭代器
    public Iterator<E> preorderIterator() {
        return new PreorderIterator();
    }

    private class PreorderIterator implements Iterator<E> {
        private Stack<Node> stack = new Stack<>();

        public PreorderIterator() {
            if (root != null) stack.push(root);
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public E next() {
            Node current = stack.pop();
            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
            return current.element;
        }
    }

    // 插入元素
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