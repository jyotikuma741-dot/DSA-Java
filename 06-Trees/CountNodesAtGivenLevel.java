//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.ArrayList;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
  class Tree {
        

        public static int NumberofNodesatagivenLevel(TreeNode root,int level ){
           if(root==null){
            return 0;
           }
           if(level== 0){
            return 1;
           }
            int left = NumberofNodesatagivenLevel(root.left, level - 1);

    int right = NumberofNodesatagivenLevel(root.right, level - 1);

    return left + right;
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
         Scanner sc= new Scanner(System.in);
        System.out.println("enter the level" );
        int level=sc.nextInt();
     
    System.out.println("no. of nodes at a given level"+NumberofNodesatagivenLevel( root,level ));
     
       sc.close();
    }

}
