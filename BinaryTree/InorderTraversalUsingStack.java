import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class InorderTraversalUsingStack {

    // Function to perform inorder traversal using a stack
    public void inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point
            current = stack.pop();
            System.out.print(current.val + " ");

            // Visit the right subtree
            current = current.right;
        }
    }

    // Sample tree creation and traversal test
    public static void main(String[] args) {
        /* Construct the following binary tree
                  1
                 / \
                2   3
               / \
              4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InorderTraversalUsingStack tree = new InorderTraversalUsingStack();
        System.out.println("Inorder traversal of binary tree is:");
        tree.inorderTraversal(root);
    }
}
