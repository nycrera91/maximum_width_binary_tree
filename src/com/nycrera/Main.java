package com.nycrera;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(6);
        root.right.right.right = new TreeNode(7);

                /*   Constructed Binary tree is:
                1
              /   \
            2      3
          /  \      \
         4    5      8
                   /   \
                  6     7    */

        TreeMaxWidthUsingQueue treeMaxWidthUsingQueue = new TreeMaxWidthUsingQueue();

        System.out.println(treeMaxWidthUsingQueue.maxWidth(root));

    }
}
