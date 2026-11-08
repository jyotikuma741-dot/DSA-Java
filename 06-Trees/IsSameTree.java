class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val == q.val &&
            isSameTree(p.left, q.left) &&
            isSameTree(p.right, q.right)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Creating first binary tree (p)
        TreeNode p = new TreeNode(1);

        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);

        p.right.right = new TreeNode(6);
        p.right.left = new TreeNode(8);


        // Creating second binary tree (q)
        TreeNode q = new TreeNode(1);

        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(5);

        q.right.right = new TreeNode(6);
        q.right.left = new TreeNode(8);


        // Calling the method
        Solution obj = new Solution();

        boolean result = obj.isSameTree(p, q);

        System.out.println("Are both trees same? " + result);
    }
}
