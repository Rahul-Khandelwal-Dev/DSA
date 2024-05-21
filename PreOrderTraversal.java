import java.util.ArrayList;
import java.util.Scanner;

public class PreOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();

        // Read the elements into an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(sc.nextInt());

        // Construct BST and print pre-order traversal
        BinaryTree tree = new BinaryTree();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = tree.insert(root, arr.get(i));
        }

        // Print pre-order traversal
        tree.preorder(root);
    }
}