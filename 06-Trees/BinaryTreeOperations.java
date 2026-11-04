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
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " → ");
        inorder(root.right);
    }
    public static void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " → ");
    }
    public static int CountNode(TreeNode root){
        if(root==null){
            return 0;}
            int CountLeft=CountNode(root.left);
            int CountRight=CountNode(root.right);
            return 1+ CountLeft + CountRight;
    } 
    public static int CountLeafNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 1;
        }
        return CountLeafNodes(root.left)+CountLeafNodes(root.right);
    }
    public static int SumofNodes(TreeNode root){
        if (root==null){
            return 0;
        }
        int SumLeft=SumofNodes(root.left);
            int SumRight=SumofNodes(root.right);
            return root.val+ SumLeft + SumRight;
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
        preorder(root);

        System.out.println("\nInorder Traversal:");
        inorder(root);

        System.out.println("\npostorder Traversal:");
        postorder(root);
       System.out.println("\nTotal nodes: " + CountNode(root));
        System.out.println("\nTotal leafnodes: " + CountLeafNodes(root));
        System.out.println("\nTotal SumofNodesnodes: " + SumofNodes(root));
    }
}
