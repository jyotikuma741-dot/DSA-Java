class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
 class Main {
    public static  void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val + " → ");
        preorder(root.left);
        preorder(root.right);
    }
   public static void main(String[] args) {

        // Creating a binary tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println("Preorder Traversal:");
        preorder(root);} 
 }
