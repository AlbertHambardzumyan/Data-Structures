package ADT.BST;

/**
 * @author Albert Hambardzumyan
 */
public class BST {

    private class Node {
        private int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public int min() {
        if (root == null)
            throw new TreeException("Tree is empty!");
        Node tmp = root;
        while (tmp.left != null)
            tmp = tmp.left;
        return tmp.value;
    }

    public int max() {
        if (root == null)
            throw new TreeException("Tree is empty!");
        Node tmp = root;
        while (tmp.right != null)
            tmp = tmp.right;
        return tmp.value;
    }

    public Node search(int value) {
        return searchWrapper(root, value);
    }

    private Node searchWrapper(Node node, int value) {
        if (node == null || node.value == value)
            return node;
        if (value < node.value)
            return searchWrapper(node.left, value);
        return searchWrapper(node.right, value);
    }

    public void inorder() {
        inorderWrapper(root);
    }

    private void inorderWrapper(Node root) {
        if (root != null) {
            inorderWrapper(root.left);
            System.out.print(root.value + ", ");
            inorderWrapper(root.right);
        }
    }

    public void preorder() {
        preorderWrapper(root);
    }

    private void preorderWrapper(Node root) {
        if (root != null) {
            System.out.print(root.value + ", ");
            preorderWrapper(root.left);
            preorderWrapper(root.right);
        }
    }

    public void postorder() {
        postorderWrapper(root);
    }

    private void postorderWrapper(Node root) {
        if (root != null) {
            postorderWrapper(root.left);
            postorderWrapper(root.right);
            System.out.print(root.value + ", ");
        }
    }

    public void insert(int value) {
        root = insertWrapper(root, value);
    }

    private Node insertWrapper(Node node, int value) {
        if (node == null)
            return new Node(value);

        Node newSubtree;
        if (value < node.value) {
            newSubtree = insertWrapper(node.left, value);
            node.left = newSubtree;
            return node;
        } else if (value > node.value) {
            newSubtree = insertWrapper(node.right, value);
            node.right = newSubtree;
            return node;
        } else
            throw new TreeException("Duplicate record!");
    }

    public void readFromArray(int[] array) {
        root = readFromArrayWrapper(array, 0, array.length - 1);
    }

    private Node readFromArrayWrapper(int[] array, int from, int to) {
        if (from > to)
            return null;
        int middle = (from + to) / 2;
        Node node = new Node(array[middle]);
        node.left = readFromArrayWrapper(array, from, middle - 1);
        node.right = readFromArrayWrapper(array, middle + 1, to);
        return node;
    }
}
