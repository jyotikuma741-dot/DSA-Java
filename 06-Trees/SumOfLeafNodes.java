//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
    
    
    public static int Sumofleafnodes(TreeNode root ){
        if (root==null){
            return 0;
        }
        if(root.left==null&& root.right==null){
            return root.val;
        }
         int leftsum = Sumofleafnodes(root.left);
           int rightsum = Sumofleafnodes(root.right);
           return leftsum + rightsum;
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
       System.out.println("\nsum of Leaf nodes: "+ Sumofleafnodes( root ));
       
        
    }

  }
