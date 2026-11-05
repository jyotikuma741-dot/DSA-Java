
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
    public static  int MaxElement(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int Maxleft=MaxElement(root.left);
        int Maxright=MaxElement(root.right);
        return Math.max(root.val,Math.max(Maxleft,Maxright));
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
       System.out.println("\nmaximum element in the tree: " +MaxElement(root));
        
    }
}
