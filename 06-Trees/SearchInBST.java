
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

public class SearchInBST {

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null) {
            return null;
        }

        if(root.val == val) {
            return root;
        }

        if(root.val > val) {
            return searchBST(root.left, val);
        }

        else {
            return searchBST(root.right, val);
        }
    }

    // Print the returned subtree
    public static void printTree(TreeNode root) {

        if(root == null) {
            System.out.println("null");
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            TreeNode temp = q.poll();

            System.out.print(temp.val + " ");

            if(temp.left != null) {
                q.add(temp.left);
            }

            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {

        // Creating a valid Binary Search Tree
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        SearchInBST obj = new SearchInBST();

        TreeNode result = obj.searchBST(root, val);

        System.out.print("Search Result: ");
        printTree(result);
    }
}
