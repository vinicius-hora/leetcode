/*
 * https://leetcode.com/problems/same-tree/description/
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 

Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class SameTree {

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        Integer[] pArray = {1,2,3};
        Integer[] qArray = {1,null,3};

        TreeNode p = buildTree(pArray);
        TreeNode q = buildTree(qArray);

        System.out.println("valor: " + sameTree.isSameTree(p,q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {


        return percorrerArvore(p, q);
        
    }

    public boolean percorrerArvore(TreeNode a, TreeNode b){
        if( a == null && b == null){
            return true;
        }
        if( a == null) {
            return false;
        }
        if( b == null){ 
            return false;
        }
        if( a.val != b.val){ 
            return false;
        }

        return percorrerArvore(a.right, b.right) && percorrerArvore(a.left, b.left);

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            if (current != null) {
                // Adiciona filho esquerdo
                if (i < arr.length) {
                    current.left = arr[i] != null ? new TreeNode(arr[i]) : null;
                    queue.offer(current.left);
                }
                i++;

                // Adiciona filho direito
                if (i < arr.length) {
                    current.right = arr[i] != null ? new TreeNode(arr[i]) : null;
                    queue.offer(current.right);
                }
                i++;
            }
        }

        return root;
    }
    
}
