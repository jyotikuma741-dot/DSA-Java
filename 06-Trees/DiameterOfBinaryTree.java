Approach 1-
  
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
//Approach 1-
class Solution {
    int max=0;
    public  int diameterOfBinaryTree(TreeNode root) {
            height(root); 
                return max;}
         public int height(TreeNode root){
            if(root== null){
                return 0;
            }
        int left=height( root.left);
         int right=height( root.right);
         max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
        }
  // approach 2-
  

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
        System.out.println("diameter of tree: " +obj. diameterOfBinaryTree( root));
    }
}
