package algorithms.leetcode;

import algorithms.BST.Node;
import java.util.LinkedList;

public class PathSumBST {

    TreeNode root;


    boolean hasPathSum(TreeNode root, int sum) {

        if (root == null)
            return false;

        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();

        LinkedList<Integer> values = new LinkedList<Integer>();

        nodes.add(root);
        values.add(root.data);

        while (!nodes.isEmpty()) {

            TreeNode curr = nodes.poll();
            int sumValue = values.poll();

            if (curr.left == null && curr.right == null && sumValue == sum) {
                return true;
            }


            if (curr.left != null) {

                nodes.add(curr.left);
                values.add(sumValue + curr.left.data);

            }


            if (curr.right != null) {

                nodes.add(curr.right);
                values.add(sumValue + curr.right.data);

            }
          /* if (node == null)
            return false;

        return hasPathSum(node.left, sum - node.data) || hasPathSum(node.right, sum - node.data);*/



        }
        return  false;
    }

    public static void main (String[]args){

        int sum = 21;

        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
        PathSumBST tree = new PathSumBST();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(2);

        if (tree.hasPathSum(tree.root, sum))
            System.out.println("There is a root to leaf path with sum " + sum);
        else
            System.out.println("There is no root to leaf path with sum " + sum);
    }




}



