import java.util.List;
import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
     static List<Integer> list = new ArrayList<>();
    public  static List<Integer> rightSideView(TreeNode root) {
     
       helper(root, 0);
        return list;
    }
static void helper(TreeNode root, int level) {
        if (root== null){
            return;
        }
        if(level==list.size()){
            list.add(root.val);
                   }
                   helper(root.right, level + 1);
         helper(root.left, level + 1);
  
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

      System.out.println(rightSideView(root));
     
    }
}
