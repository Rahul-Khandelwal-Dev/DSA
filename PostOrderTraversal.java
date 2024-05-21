import java.util.ArrayList;
import java.util.Scanner;

public class PostOrderTraversal {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<n ;i++) {
                arr.add(scan.nextInt());
            }

            BinaryTree tree = new BinaryTree();
            Node root = null;
            for(int i=0; i<n ;i++) {
                root = tree.insert(root,arr.get(i));
            }

            tree.postOrder(root);
        }
}
