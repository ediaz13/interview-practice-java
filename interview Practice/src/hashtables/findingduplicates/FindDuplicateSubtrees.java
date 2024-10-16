package hashtables.findingduplicates;

public class FindDuplicateSubtrees {

    public void findDuplicateSubtrees() {

    }

    // Method to insert nodes in the binary tree
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to print the binary tree (in-order traversal)
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        FindDuplicateSubtrees tree = new FindDuplicateSubtrees();
        TreeNode root = null;
        int[] values = {5, 3, 8, 1, 4, 7, 9};

        for (int val : values) {
            root = tree.insert(root, val);
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}