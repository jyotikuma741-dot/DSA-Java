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
    
    
    public static boolean Search(TreeNode root, int target ){
        
        if (root==null){
            return false  ;
        }
        if(root.val==target ){
           return true;
        }
        
       return Search(root.left, target) || Search(root.right, target);
        
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
        System.out.println("enter the target element" );
        int target=sc.nextInt();
      boolean result = Search(root, target);
        if (result) {
    System.out.println("Element found");
      } else {
    System.out.println("Element not found");
     }
       
    }

  }
