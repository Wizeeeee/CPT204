package Lab11;

public class BSTWithNumberOfLeaves<E extends Comparable<E>> extends Inorder<E> {
    public int getNumberOfLeaves() {
        return countLeaves(super.root);
    }
    private int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
}