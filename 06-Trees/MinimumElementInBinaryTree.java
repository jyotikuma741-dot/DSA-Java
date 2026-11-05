class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
    public static  int MinElement(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int Minleft=MinElement(root.left);
        int Minright=MinElement(root.right);
        return Math.min(root.val,Math.min(Minleft,Minright));
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
       System.out.println("\nminimum element in the tree: " +MinElement(root));
        
    }
}
