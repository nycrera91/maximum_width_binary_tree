package com.nycrera;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alperen Asa
 * Date: 22.04.2020
 * Time: 10:04
 * Project Name: Maximum width of a binary tree
 */

public class TreeMaxWidthUsingQueue {

    public int maxWidth(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int maxWidth = 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            int count = queue.size();

            maxWidth = Math.max(maxWidth, count);

            while(count-- > 0) {
                TreeNode deletedTreeNode = queue.remove();

                if(deletedTreeNode.left != null) {
                    queue.add(deletedTreeNode.left);
                }

                if(deletedTreeNode.right != null) {
                    queue.add(deletedTreeNode.right);
                }
            }

        }

        return maxWidth;
    }

}
