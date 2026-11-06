

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
    public  static int maxDepth(TreeNode root) {
        if (root== null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right =maxDepth(root.right);
        return 1+ Math.max(left,right);
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
         
    System.out.println("max depth of tree"+ maxDepth(root) );

    }

}
