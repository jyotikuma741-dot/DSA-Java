
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);

        if (left == -1) {
            return -1;
        }

        int right = height(root.right);

        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        // Creating a binary tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(8);

        Solution obj = new Solution();

        boolean result = obj.isBalanced(root);

        System.out.println("Is Balanced: " + result);
    }
}
