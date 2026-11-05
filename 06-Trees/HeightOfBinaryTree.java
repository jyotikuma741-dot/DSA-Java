class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
    public static  int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=Height(root.left);
        int rightheight=Height(root.right);
        return 1+(Math.max(leftheight,rightheight));
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
       System.out.println("\nHeight of  the tree: " +Height(root));
        
    }
}
