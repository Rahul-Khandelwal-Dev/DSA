class BinaryTree {
    Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);

        if (x < root.val)
            root.left = insert(root.left, x);
        else
            root.right = insert(root.right, x);

        return root;
    }

    void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}