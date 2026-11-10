//try again
import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode curr = root;

        while (true) {

            if (curr.val <= val) {

                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new TreeNode(val);
                    break;
                }

            } else {

                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new TreeNode(val);
                    break;
                }
            }
        }

        return root;
    }

    // Print tree using level order traversal
    public static void printTree(TreeNode root) {

        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            System.out.print(curr.val + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(8);

        Solution obj = new Solution();

        int val = 7;

        root = obj.insertIntoBST(root, val);

        System.out.println("After insertion:");
        printTree(root);
    }
}
