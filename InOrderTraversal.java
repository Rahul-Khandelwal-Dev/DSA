import jdk.incubator.vector.VectorOperators;

import java.util.ArrayList;
import java.util.Scanner;

public class InOrderTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i < n ;i++) {
            arr.add(scan.nextInt());
        }

        BinaryTree tree = new BinaryTree();
        Node root = null;
        for(int i=0; i < n ;i++) {
            root = tree.insert(root, arr.get(i));
        }

        tree.inOrder(root);
    }
}
