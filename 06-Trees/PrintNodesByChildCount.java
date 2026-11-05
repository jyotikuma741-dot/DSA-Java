
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
    public static void OnlyoneNode(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right!=null){
            System.out.println(root.val);
        }
        if(root.right==null&&root.left!=null){
            System.out.println(root.val);}
        OnlyoneNode(root.left);
        OnlyoneNode(root.right);
       
    }
    public static void TwoNodes(TreeNode root){
        if (root== null){
            return;
        }
         if(root.left!=null&&root.right!=null){
            System.out.println(root.val);
        }
       TwoNodes(root.right);
       TwoNodes(root.left);
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
       System.out.println("\nnodes which have only one child: " );
       OnlyoneNode(root);
        System.out.println("\nnodes which have two child: " );
          TwoNodes(root);
    }

  }
