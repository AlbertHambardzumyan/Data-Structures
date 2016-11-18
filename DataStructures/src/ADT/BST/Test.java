package ADT.BST;

/**
 * @author Albert Hambardzumyan
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("Init ADT.BST...");
        BST bst = new BST();

        System.out.println("ADT.BST Insert... 30");
        bst.insert(30);
        System.out.println("ADT.BST Insert... 50");
        bst.insert(50);
        System.out.println("ADT.BST Insert... 40");
        bst.insert(40);
        System.out.println("ADT.BST Insert... 60");
        bst.insert(60);
        System.out.println("ADT.BST Insert... 20");
        bst.insert(20);
        System.out.println("ADT.BST Insert... 25");
        bst.insert(25);
        System.out.println("ADT.BST Insert... 10");
        bst.insert(10);

        System.out.println("\nADT.BST Min... should be 10");
        System.out.println(bst.min());
        System.out.println("ADT.BST Max... should be 60");
        System.out.println(bst.max());

        System.out.println("ADT.BST Search... should be Node");
        System.out.println(bst.search(20));

        System.out.println("\nADT.BST inorder... should be 10, 20, 25, 30, 40, 50, 60");
        bst.inorder();

        System.out.println("\nADT.BST preorder... should be 30, 20, 10, 25, 50, 40, 60");
        bst.preorder();

        System.out.println("\nADT.BST postorder... should be 10, 25, 20, 40, 60, 50, 30");
        bst.postorder();

        System.out.println("\n\nRead from array...");
        int[] array = {5, 10, 20, 25, 30, 40, 50, 60};
        BST bst_2 = new BST();
        bst_2.readFromArray(array);
        System.out.println("ADT.BST inorder... should be 5, 10, 20, 25, 30, 40, 50, 60");
        bst_2.inorder();
    }
}
