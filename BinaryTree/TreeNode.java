// Node class for the binary tree
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Binary Tree class
class TreeNode {
    Node root;

    // Constructor
    TreeNode() {
        root = null;
    }

    // Preorder traversal (Root, Left, Right)
    void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Inorder traversal (Left, Root, Right)
    void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Postorder traversal (Left, Right, Root)
    void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    // Insert node manually
    void createSampleTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }

    // Main method to test tree creation and traversal
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree.createSampleTree();

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }
}
